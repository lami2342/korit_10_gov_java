package study.ch21;

import java.io.*;

public class Exception02 {

    public static String read(String path) {
        StringBuilder stringBuilder = new StringBuilder();

        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("해당 파일이 존재 하지 않습니다.");
        } catch (IOException e) {
            System.out.println("읽을 수 없는 데이터 입니다.");
        } catch (Exception e) {
            System.out.println("기타 다른 예외 처리");
        }

        return stringBuilder.toString();
    }




public static String read2(String path)
    throws IOException {
        StringBuilder stringBuilder = new StringBuilder();

        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = null;
    while ((line = bufferedReader.readLine()) != null) {
        stringBuilder.append(line);
    }
    return stringBuilder.toString();
}

public static void main(String[] args) {




    }

}





