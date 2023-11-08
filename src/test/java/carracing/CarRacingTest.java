package carracing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarRacingTest {
    @Test
    @DisplayName("자동차 대수 확인 테스트")
    void checkTotalCarsTest() {
        int result = CarRacing.createCars(4).size();
        assertThat(result).isEqualTo(4);
    }

    @Test
    @DisplayName("자동차 이동 횟수 테스트")
    void checkMovementCountTest(){
        Car car = new Car();
        car.setMaxMovementCount(5);
        int result = car.getMaxMovementCount();
        assertThat(result).isEqualTo(5);
    }

    @Test
    @DisplayName("자동차 이동 테스트")
    void carMovementTest(){
        Car car = new Car();
        car.carMove(new RandomCarMovement());
        assertThat(car.getCarPosition()).isEqualTo(1);
    }
}
