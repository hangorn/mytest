package es.magneticdevs.mytest;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

@WebServlet(urlPatterns = "/*", name = "MyTestUIServlet", asyncSupported = true)
@VaadinServletConfiguration(ui = MyTestUI.class, productionMode = false)
public class MyTestUIServlet extends VaadinServlet {
}