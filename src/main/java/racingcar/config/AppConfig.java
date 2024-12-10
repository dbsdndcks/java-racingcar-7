package racingcar.config;

import racingcar.controller.RacingController;
import racingcar.service.RacingService;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class AppConfig {
    public RacingController racingController() {
        return new RacingController(inputView(), outputView(), racingService());
    }

    private InputView inputView() {
        return new InputView();
    }

    private OutputView outputView() {
        return new OutputView();
    }

    private RacingService racingService() {
        return new RacingService();
    }

}
