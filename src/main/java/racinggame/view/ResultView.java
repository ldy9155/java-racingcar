package racinggame.view;

import racinggame.domain.Car;
import racinggame.dto.RacingResultDTO;
import racinggame.dto.RacingRoundResultDTO;

import java.util.List;

public class ResultView {

    private static final String DELTMITER = " : ";
    private static final String MARKER = "-";
    private static final String ROUND_END = "\n";
    private static final String WINNER_DELTMITER = ", ";

    public static void printResult(RacingResultDTO racingResultDTO) {
        System.out.println("실행 결과");
        for (RacingRoundResultDTO racingRoundResultDTO : racingResultDTO.getRacingRoundResultDTOS()) {
            printRoundResult(racingRoundResultDTO);
        }
        System.out.print(printWinner(racingResultDTO.getWinners()));
    }

    public static String printWinner(List<String> winners) {
        if(winners.isEmpty()){
            return "모든 자동차가 전진을 못해, 자동차경주 우승자가 없습니다.";
        }
        return String.join(WINNER_DELTMITER, winners) + "가 최종 우승했습니다.";
    }

    private static void printRoundResult(RacingRoundResultDTO racingRoundResultDTO) {
        racingRoundResultDTO.getCars()
                .forEach(car -> System.out.println(printCarPosition(car)));
        System.out.print(ROUND_END);
    }

    public static String printCarPosition(Car car) {
        return car.getCarName() + DELTMITER + MARKER.repeat(car.getPosition());
    }
}