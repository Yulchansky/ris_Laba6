package controllers;

import entity.Treatment;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.xml.ws.WebServiceRef;
import service.TreatmentService;

import java.io.IOException;
import java.util.List;

@WebServlet("/getByMedicine")
public class GetByMedicineController extends HttpServlet {
    @WebServiceRef
    TreatmentService treatmentService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html; charset=UTF-8");
        String medicine = req.getParameter("medicine");
        List<Treatment> treatment = treatmentService.getByMedicine(medicine);
        if (treatment == null) {
            resp.getWriter().write("Записей нет");
        } else {
            req.setAttribute("treatment", treatment);
            req.getRequestDispatcher("treatment.jsp").forward(req, resp);
        }
    }
}