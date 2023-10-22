package baseball.application;

import baseball.domain.Hint;
import baseball.domain.Player;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class NumberService {

    public List<Integer> getRandomNumber() {
        Set<Integer> numberSet = new HashSet<>();
        while (numberSet.size() < 3) {
            numberSet.add(Randoms.pickNumberInRange(1, 9));
        }

        return new ArrayList<>(numberSet);
    }

    public Hint getHint(Player computer, Player player) {
        List<Integer> computerNumber = computer.getNumbers();
        List<Integer> playerNumber = player.getNumbers();
        Hint hint = new Hint();

        compareNumber(computerNumber, playerNumber, hint);

        return hint;
    }

    private static void compareNumber(List<Integer> computerNumber, List<Integer> playerNumber, Hint hint) {
        for (int i = 0; i < playerNumber.size(); i++) {
            Integer myNumber = playerNumber.get(i);
            if (Objects.equals(myNumber, computerNumber.get(i))) {
                hint.increaseStrike();
            } else if (computerNumber.contains(myNumber)) {
                hint.increaseBall();
            }
        }
    }
}
