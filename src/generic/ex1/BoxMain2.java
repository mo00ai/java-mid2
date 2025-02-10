package generic.ex1;

public class BoxMain2 {
    public static void main(String[] args) {

        //shift f6 - 변수 단체 이름 바꾸기
        //ctrl alt shift t -> inline variable
        // -> 변수 과정 합치기

        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        Integer integer= (Integer)integerBox.get();
        System.out.println("Integer= " + integer);

        ObjectBox stringBox = new ObjectBox();
        stringBox.set(10);
        String str = (String) stringBox.get();
        System.out.println("str = " + str);

        //잘못된 타입의 인수 전달시
        integerBox.set("문자100");
        Integer result= (Integer)integerBox.get(); // String -> Integer 캐스팅 예외
        System.out.println("result= " + result); //에러

    }
}
