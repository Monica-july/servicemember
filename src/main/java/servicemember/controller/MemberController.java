package servicemember.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Value("${server.port}")
    private String serverport;
    @RequestMapping("/getAll")
    public List<String> getAllMember(){
        List<String> memberList = new ArrayList<String>(10);
        memberList.add("lisa");
        memberList.add("tom");
        memberList.add("joey");
        memberList.add("serverport: "+serverport);
        return memberList;
    }
    @RequestMapping("/index")
    public String index(){
        return "a.  serverport"+serverport;
    }
}
