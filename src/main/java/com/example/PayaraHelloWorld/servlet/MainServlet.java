package com.example.PayaraHelloWorld.servlet;

import java.io.*;

import com.example.PayaraHelloWorld.beans.CalculationResult;
import com.example.PayaraHelloWorld.calculator.Calculator;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "process_calculation", value = {"/process_calculation"})
public class MainServlet extends HttpServlet {

    private Calculator calculator;

    public void init() {
        calculator = new Calculator();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");

        String calculate = request.getParameter("calculate");
        switch (calculate) {
            case "calculate_max"
                    -> calculateMax(request, response);
            case "calculate_min"
                    -> calculateMin(request, response);
            case "calculate_sum"
                    -> calculateSum(request, response);
            case "calculate_average"
                    -> calculateAverage(request, response);
        }
    }

    private void calculateAverage(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        double start = Double.parseDouble(request.getParameter("start"));
        double end = Double.parseDouble(request.getParameter("end"));
        double step = Double.parseDouble(request.getParameter("step"));
        double a = Double.parseDouble(request.getParameter("a"));

        double average = calculator.average(start, end, step, a);
        String calculationName = "Calculate Average Value";

        CalculationResult calculationResult = new CalculationResult();
        calculationResult.setCalculationName(calculationName);
        calculationResult.setValue(Double.toString(average));

        request.setAttribute("calculationResult", calculationResult);
        request.getRequestDispatcher("/result.jsp").forward(request, response);

    }

    private void calculateSum(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        double start = Double.parseDouble(request.getParameter("start"));
        double end = Double.parseDouble(request.getParameter("end"));
        double step = Double.parseDouble(request.getParameter("step"));
        double a = Double.parseDouble(request.getParameter("a"));

        double sum = calculator.sum(start, end, step, a);
        String calculationName = "Calculate Sum Value";

        CalculationResult calculationResult = new CalculationResult();
        calculationResult.setCalculationName(calculationName);
        calculationResult.setValue(Double.toString(sum));

        request.setAttribute("calculationResult", calculationResult);
        request.getRequestDispatcher("/result.jsp").forward(request, response);

    }

    private void calculateMax(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        double start = Double.parseDouble(request.getParameter("start"));
        double end = Double.parseDouble(request.getParameter("end"));
        double step = Double.parseDouble(request.getParameter("step"));
        double a = Double.parseDouble(request.getParameter("a"));

        int maxIndex = calculator.findMax(start, end, step, a);
        String calculationName = "Calculate Max Index";

        CalculationResult calculationResult = new CalculationResult();
        calculationResult.setCalculationName(calculationName);
        calculationResult.setValue(Integer.toString(maxIndex));

        request.setAttribute("calculationResult", calculationResult);
        request.getRequestDispatcher("/result.jsp").forward(request, response);

    }

    private void calculateMin(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        double start = Double.parseDouble(request.getParameter("start"));
        double end = Double.parseDouble(request.getParameter("end"));
        double step = Double.parseDouble(request.getParameter("step"));
        double a = Double.parseDouble(request.getParameter("a"));

        int minIndex = calculator.findMin(start, end, step, a);
        String calculationName = "Calculate Min Index";

        CalculationResult calculationResult = new CalculationResult();
        calculationResult.setCalculationName(calculationName);
        calculationResult.setValue(Integer.toString(minIndex));

        request.setAttribute("calculationResult", calculationResult);
        request.getRequestDispatcher("/result.jsp").forward(request, response);

    }

    public void destroy() {

    }
}