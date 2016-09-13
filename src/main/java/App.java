import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      boolean loggedin = false;
      // if(request.session().attribute("loggedin")!=null) {
      //   loggedin=request.session().attribute("loggedin");
      // }
      // String email = request.queryParams("email");
      // String password = request.queryParams("password");
      //
      // if ((email=="guest@sample.com")&&(password=="123")) {
      //   loggedin = true;
      //   request.session().attribute("loggedin", true);
      // } else {
      //   loggedin = false;
      //   request.session().attribute("loggedin", false);
      // }
      // model.put("loggedin", request.session().attribute("loggedin"));
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/result", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      ArrayList<Tune> myTunes = request.session().attribute("myTunes");
      if(myTunes==null) {
        myTunes = new ArrayList<Tune>();
        request.session().attribute("myTunes", myTunes);
      }
      Tune tune = new Tune(request.queryParams("title"),request.queryParams("album"),request.queryParams("artist"),request.queryParams("genre"), request.queryParams("year"), request.queryParams("media"), request.queryParams("duration"), request.queryParams("filename"));
      myTunes.add(tune);
      //request.session().attribute("myTunes", myTunes);
      model.put("tunes", myTunes);
      model.put("template", "templates/result.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
}
