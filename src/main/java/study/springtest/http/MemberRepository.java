package study.springtest.http;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@Repository
public class MemberRepository {

    private Long id = 0L;
    HashMap<Long, String> users = new HashMap<>();

    public Long save(String name) {
        users.put(++id, name);

        for (Map.Entry<Long, String> longStringEntry : users.entrySet()) {
            log.info("member={}", longStringEntry.getKey() + longStringEntry.getValue());
        }

        return id;
    }

    public String findOne(Long id) {
        log.info(users.get(1L));
        return users.get(id);
    }
}
