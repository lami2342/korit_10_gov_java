package study.ch21;

import java.util.List;

public class Exception03 {
    static void main(String[] args) {
        List<String> usernames = List.of("aaa","bbb","ccc");

        try {
            String username = null;
            if (username == null) {
                throw new NullPointerException();
            }else {
                boolean isEmpty = usernames.stream().filter(u -> u.equals(username)).count() == 0;

                if (isEmpty) {
                    throw new UsernameNotFoundException();
                }
            }
        }catch (NullPointerException e){
            System.out.println("username가 NULL입니다.");
        } catch (UsernameNotFoundException e){
            System.out.println("사용자 아이디를 찾지 못하였습니다.");
        }
        System.out.println("프로그램 정상 종료");
        }
}
