package es.magneticdevs.mytest;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

@VaadinServletConfiguration(ui = MyTestUI.class, productionMode = false)
public class MyTestUIServlet extends VaadinServlet {
}