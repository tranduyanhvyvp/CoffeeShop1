package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class blog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <title>Coffee - Free Bootstrap 4 Template by Colorlib</title>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    \n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Josefin+Sans:400,700\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Great+Vibes\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/open-iconic-bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/aos.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/ionicons.min.css\">\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap-datepicker.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/jquery.timepicker.css\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("    <link rel=\"stylesheet\" href=\"css/flaticon.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/icomoon.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("  \t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "component/header.jsp", out, false);
      out.write("\n");
      out.write("    <!-- END nav -->\n");
      out.write("\n");
      out.write("    <section class=\"home-slider owl-carousel\">\n");
      out.write("\n");
      out.write("      <div class=\"slider-item\" style=\"background-image: url(images/bg_3.jpg);\" data-stellar-background-ratio=\"0.5\">\n");
      out.write("      \t<div class=\"overlay\"></div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("          <div class=\"row slider-text justify-content-center align-items-center\">\n");
      out.write("\n");
      out.write("            <div class=\"col-md-7 col-sm-12 text-center ftco-animate\">\n");
      out.write("            \t<h1 class=\"mb-3 mt-5 bread\">Blog</h1>\n");
      out.write("\t            <p class=\"breadcrumbs\"><span class=\"mr-2\"><a href=\"index.html\">Home</a></span> <span>Blog</span></p>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    <section class=\"ftco-section\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row d-flex\">\n");
      out.write("          <div class=\"col-md-4 d-flex ftco-animate\">\n");
      out.write("          \t<div class=\"blog-entry align-self-stretch\">\n");
      out.write("              <a href=\"blog-single.html\" class=\"block-20\" style=\"background-image: url('images/image_1.jpg');\">\n");
      out.write("              </a>\n");
      out.write("              <div class=\"text py-4 d-block\">\n");
      out.write("              \t<div class=\"meta\">\n");
      out.write("                  <div><a href=\"#\">Sept 28, 2018</a></div>\n");
      out.write("                  <div><a href=\"#\">Admin</a></div>\n");
      out.write("                  <div><a href=\"#\" class=\"meta-chat\"><span class=\"icon-chat\"></span> 3</a></div>\n");
      out.write("                </div>\n");
      out.write("                <h3 class=\"heading mt-2\"><a href=\"#\">Coffee Testing Day</a></h3>\n");
      out.write("                <p>A small river named Duden flows by their place and supplies it with the necessary regelialia.</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-4 d-flex ftco-animate\">\n");
      out.write("          \t<div class=\"blog-entry align-self-stretch\">\n");
      out.write("              <a href=\"blog-single.html\" class=\"block-20\" style=\"background-image: url('images/image_2.jpg');\">\n");
      out.write("              </a>\n");
      out.write("              <div class=\"text py-4 d-block\">\n");
      out.write("              \t<div class=\"meta\">\n");
      out.write("                  <div><a href=\"#\">Sept 28, 2018</a></div>\n");
      out.write("                  <div><a href=\"#\">Admin</a></div>\n");
      out.write("                  <div><a href=\"#\" class=\"meta-chat\"><span class=\"icon-chat\"></span> 3</a></div>\n");
      out.write("                </div>\n");
      out.write("                <h3 class=\"heading mt-2\"><a href=\"#\">Coffee Testing Day</a></h3>\n");
      out.write("                <p>A small river named Duden flows by their place and supplies it with the necessary regelialia.</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-4 d-flex ftco-animate\">\n");
      out.write("          \t<div class=\"blog-entry align-self-stretch\">\n");
      out.write("              <a href=\"blog-single.html\" class=\"block-20\" style=\"background-image: url('images/image_3.jpg');\">\n");
      out.write("              </a>\n");
      out.write("              <div class=\"text py-4 d-block\">\n");
      out.write("              \t<div class=\"meta\">\n");
      out.write("                  <div><a href=\"#\">Sept 28, 2018</a></div>\n");
      out.write("                  <div><a href=\"#\">Admin</a></div>\n");
      out.write("                  <div><a href=\"#\" class=\"meta-chat\"><span class=\"icon-chat\"></span> 3</a></div>\n");
      out.write("                </div>\n");
      out.write("                <h3 class=\"heading mt-2\"><a href=\"#\">Coffee Testing Day</a></h3>\n");
      out.write("                <p>A small river named Duden flows by their place and supplies it with the necessary regelialia.</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-4 d-flex ftco-animate\">\n");
      out.write("          \t<div class=\"blog-entry align-self-stretch\">\n");
      out.write("              <a href=\"blog-single.html\" class=\"block-20\" style=\"background-image: url('images/image_4.jpg');\">\n");
      out.write("              </a>\n");
      out.write("              <div class=\"text py-4 d-block\">\n");
      out.write("              \t<div class=\"meta\">\n");
      out.write("                  <div><a href=\"#\">Sept 28, 2018</a></div>\n");
      out.write("                  <div><a href=\"#\">Admin</a></div>\n");
      out.write("                  <div><a href=\"#\" class=\"meta-chat\"><span class=\"icon-chat\"></span> 3</a></div>\n");
      out.write("                </div>\n");
      out.write("                <h3 class=\"heading mt-2\"><a href=\"#\">Coffee Testing Day</a></h3>\n");
      out.write("                <p>A small river named Duden flows by their place and supplies it with the necessary regelialia.</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-4 d-flex ftco-animate\">\n");
      out.write("          \t<div class=\"blog-entry align-self-stretch\">\n");
      out.write("              <a href=\"blog-single.html\" class=\"block-20\" style=\"background-image: url('images/image_5.jpg');\">\n");
      out.write("              </a>\n");
      out.write("              <div class=\"text py-4 d-block\">\n");
      out.write("              \t<div class=\"meta\">\n");
      out.write("                  <div><a href=\"#\">Sept 28, 2018</a></div>\n");
      out.write("                  <div><a href=\"#\">Admin</a></div>\n");
      out.write("                  <div><a href=\"#\" class=\"meta-chat\"><span class=\"icon-chat\"></span> 3</a></div>\n");
      out.write("                </div>\n");
      out.write("                <h3 class=\"heading mt-2\"><a href=\"#\">Coffee Testing Day</a></h3>\n");
      out.write("                <p>A small river named Duden flows by their place and supplies it with the necessary regelialia.</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-4 d-flex ftco-animate\">\n");
      out.write("          \t<div class=\"blog-entry align-self-stretch\">\n");
      out.write("              <a href=\"blog-single.html\" class=\"block-20\" style=\"background-image: url('images/image_6.jpg');\">\n");
      out.write("              </a>\n");
      out.write("              <div class=\"text py-4 d-block\">\n");
      out.write("              \t<div class=\"meta\">\n");
      out.write("                  <div><a href=\"#\">Sept 28, 2018</a></div>\n");
      out.write("                  <div><a href=\"#\">Admin</a></div>\n");
      out.write("                  <div><a href=\"#\" class=\"meta-chat\"><span class=\"icon-chat\"></span> 3</a></div>\n");
      out.write("                </div>\n");
      out.write("                <h3 class=\"heading mt-2\"><a href=\"#\">Coffee Testing Day</a></h3>\n");
      out.write("                <p>A small river named Duden flows by their place and supplies it with the necessary regelialia.</p>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row mt-5\">\n");
      out.write("          <div class=\"col text-center\">\n");
      out.write("            <div class=\"block-27\">\n");
      out.write("              <ul>\n");
      out.write("                <li><a href=\"#\">&lt;</a></li>\n");
      out.write("                <li class=\"active\"><span>1</span></li>\n");
      out.write("                <li><a href=\"#\">2</a></li>\n");
      out.write("                <li><a href=\"#\">3</a></li>\n");
      out.write("                <li><a href=\"#\">4</a></li>\n");
      out.write("                <li><a href=\"#\">5</a></li>\n");
      out.write("                <li><a href=\"#\">&gt;</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </section>\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "component/footer.jsp", out, false);
      out.write("\n");
      out.write("    \n");
      out.write("  \n");
      out.write("\n");
      out.write("  <!-- loader -->\n");
      out.write("  <div id=\"ftco-loader\" class=\"show fullscreen\"><svg class=\"circular\" width=\"48px\" height=\"48px\"><circle class=\"path-bg\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke=\"#eeeeee\"/><circle class=\"path\" cx=\"24\" cy=\"24\" r=\"22\" fill=\"none\" stroke-width=\"4\" stroke-miterlimit=\"10\" stroke=\"#F96D00\"/></svg></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("  <script src=\"js/jquery.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery-migrate-3.0.1.min.js\"></script>\n");
      out.write("  <script src=\"js/popper.min.js\"></script>\n");
      out.write("  <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery.easing.1.3.js\"></script>\n");
      out.write("  <script src=\"js/jquery.waypoints.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery.stellar.min.js\"></script>\n");
      out.write("  <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("  <script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("  <script src=\"js/aos.js\"></script>\n");
      out.write("  <script src=\"js/jquery.animateNumber.min.js\"></script>\n");
      out.write("  <script src=\"js/bootstrap-datepicker.js\"></script>\n");
      out.write("  <script src=\"js/jquery.timepicker.min.js\"></script>\n");
      out.write("  <script src=\"js/scrollax.min.js\"></script>\n");
      out.write("  <script src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBVWaKrjvy3MaE7SQ74_uJiULgl1JY0H2s&sensor=false\"></script>\n");
      out.write("  <script src=\"js/google-map.js\"></script>\n");
      out.write("  <script src=\"js/main.js\"></script>\n");
      out.write("    \n");
      out.write("  </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
