public class U0901Main {
    public static void main(String[] args) {
        Integer[] intArr = {10, 20, 15};
        U0901WorkArray<Integer> insWorkArrayInt = new U0901WorkArray<Integer>(intArr);
        Float[] floatArr = new Float[5];
        for(int i = 0; i < 5; i++)
            floatArr[i] = (float)(i + 5.1);
        U0901WorkArray<Float> insWorkArrayFloat = new U0901WorkArray<Float>(floatArr);
        System.out.println(insWorkArrayInt.sum());
        System.out.println(insWorkArrayFloat.sum());
    }
}