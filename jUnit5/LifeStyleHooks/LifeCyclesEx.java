import java.util.stream.DoubleStream;

class Calc {
    static double add(double... operands) {
        return DoubleStream.of(operands).sum();
    }
}
