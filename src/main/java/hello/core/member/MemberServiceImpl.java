package hello.core.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    // AppConfig 에서 주입 하기 위한 생성자
    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //회원가입 구현
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    //회원검색 구현
    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }


    //테스트 용도
    public MemberRepository getMemberRepository() {
        return memberRepository;
    }
}
