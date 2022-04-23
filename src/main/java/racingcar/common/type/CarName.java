package racingcar.common.type;

import racingcar.common.config.ConstantUtils;
import racingcar.common.validate.ValidateUtils;

import java.util.Objects;

public class CarName {
    private final String name;

    public CarName(String name) {
        ValidateUtils.maxLength(name, ConstantUtils.CAR_NAME_MAX_LENGTH);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarName carName = (CarName) o;
        return Objects.equals(name, carName.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
