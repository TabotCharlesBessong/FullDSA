package more.lambda;

@FunctionalInterface
public interface VolumeCalculator {
    double calculateVolume(double... dimensions);
}