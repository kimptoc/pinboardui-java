package net.kimptoc.pinboardui;

import net.kimptoc.pinboard.PinboardApi;
import net.kimptoc.pinboard.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TemplateController {


    @GetMapping("/pinboard")
    public String pinboard1(
            @RequestParam(name="user", required=true, defaultValue="unknown") String user,
            @RequestParam(name="token", required=true, defaultValue="unknown") String token,
            @RequestParam(name="tag", required=false, defaultValue="") String tag,
                            Model model) {

        model.addAttribute("user", user);

        PinboardApi api = new PinboardApi();

        List<Post> posts = api.getPosts(user, token, tag);
        posts.sort((a,b) -> (a.getDescription().compareToIgnoreCase(b.getDescription())) );
        model.addAttribute("content", posts);

        return "pinboard";
    }

}
