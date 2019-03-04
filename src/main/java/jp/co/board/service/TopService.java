package jp.co.board.service;

import jp.co.board.config.BoardConfig;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TopService {
    private final BoardConfig boardConfig;

    public String getTitle() {
        return boardConfig.getTop();
    }
}
