package study.springtest.http;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
@RequiredArgsConstructor
public class HttpTestController {

    private final MemberRepository memberRepository;

    @ResponseBody
    @PostMapping("/members")
    public Long saveMember(@ModelAttribute("name") String name) {
        Long id = memberRepository.save(name);
        return id;
    }

    @ResponseBody
    @DeleteMapping("/members")
    public String findMember(@ModelAttribute("id") Long id) {
        String member = memberRepository.findOne(id);
        log.info("member={}", member);
        return memberRepository.findOne(id);
    }
}
