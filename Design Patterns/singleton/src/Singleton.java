public class Singleton {
    private static Singleton singleton;     //private static instance

    private Singleton(){                    //private constructor

    }

    public static Singleton getInstance(){  //getInstance public method
        if(singleton==null){
            singleton = new Singleton();
            return singleton;
        }
        return singleton;
    }

}
