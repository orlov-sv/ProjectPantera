package orlov.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import orlov.service.GameLogic;

import java.io.IOException;

@WebServlet("/game")
public class GameServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GameLogic gameLogic = new GameLogic();

        req.setAttribute("question", gameLogic.getQuestion("0"));
        req.getRequestDispatcher("/WEB-INF/jsp/game.jsp").forward(req, resp);

    }
}
