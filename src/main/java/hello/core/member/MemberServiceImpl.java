package hello.core.member;

public class MemberServiceImpl implements MemberService{

    private final MemberRepository memberRepository;

    // AppConfig 에서 주입 하기 위한 생성자
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
}
