package hello.core.member;

import java.util.HashMap;
import java.util.Map;


// 저장소 방식 : type1 - 메모리 회원 저장소 방식
public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> store = new HashMap<>();

    @Override
    public void save(Member member) {
        store.put(member.getId(), member);
    }

    @Override
    public Member findById(Long memberId) {
        return store.get(memberId);
    }
}
