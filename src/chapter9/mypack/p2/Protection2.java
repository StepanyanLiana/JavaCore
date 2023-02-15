package chapter9.mypack.p2;



public class Protection2 extends chapter9.mypack.p1.Protection {
    Protection2() {
        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }

}
class OtherPackage {
    OtherPackage() {
        chapter9.mypack.p1.Protection p = new chapter9.mypack.p1.Protection();
        System.out.println("кoнcтpyктop из другого пакета");
        System.out.println("n_pub = " + p.n_pub);
    }
}

