public class Computer implements Fill {

    Fill[] b;

    public Computer(String mem, String pro, String mon)
    {
        b[0] = new Memory(mem);
        b[1] = new Monitor(mon);
        b[2] = new Processor(pro);
    }
}

    enum Type
    {
        Dell,
        Alienware,
        HP,
        Lenovo,
        Asus,
        Acer,
        Apple
    }
