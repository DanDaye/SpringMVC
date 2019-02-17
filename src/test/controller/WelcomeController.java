package test.controller;

import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeController extends AbstractController {
    protected ModelAndView handleRenderRequestInternal(HttpServletRequest request,HttpServletResponse response) throws Exception {
        ModelAndView model = new ModelAndView();
        model.addObject("message","Welcome!");
        return model;
    }
}
