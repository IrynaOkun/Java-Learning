package OOP.OverloadingOverriding;

public class DynamicDispetcharization extends Object{
    public static void main(String[] args) {
        // экземпляры классов A, B, C
        A objA = new A();
        B objB = new B();
        C objC = new C();

        // ссылка на суперкласс A
        A refA; // ссылке refA можно присвоить objA, objB, objC

        //
        refA = objA; // refA ссылается на экземпляр класса A
        refA.method(); // вызов метода method() класса A

        //
        refA = objB; // refA -> objB
        refA.method(); // objB.method()

        //
        refA = objC; // refA -> objC
        refA.method(); // objC.method()
    }
}
