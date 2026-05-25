package orlov.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import orlov.model.Question;
import orlov.service.GameLogic;

import java.io.IOException;

@WebServlet("/game")
public class GameServlet extends HttpServlet {

    private final GameLogic gameLogic = new GameLogic();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String restart = req.getParameter("restart");

        Integer gameCount =
                (Integer) req.getSession().getAttribute("gameCount");

        if (gameCount == null) {
            gameCount = 0;
        }

        if ("true".equals(restart)) {

            gameCount++;

            req.getSession().setAttribute("gameCount", gameCount);

            resp.sendRedirect("game");
            return;
        }

        if (gameCount == 0) {
            gameCount++;

            req.getSession().setAttribute("gameCount", gameCount);
        }

        req.setAttribute("question", gameLogic.getQuestion("0"));

        req.getRequestDispatcher("/WEB-INF/jsp/game.jsp")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nextStep = req.getParameter("nextStep");
        Question question = gameLogic.getQuestion(nextStep);
        req.setAttribute("question", question);

        req.getRequestDispatcher("/WEB-INF/jsp/game.jsp").forward(req, resp);
    }
}
