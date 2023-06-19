package org.example.springbootdeveloper.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.example.springbootdeveloper.domain.Article;

/*요청본문을 받을객체*/
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AddArticleRequest {
    private String title;
    private String content;

    public Article toEntity(){ //빌더패턴 사용해서 dto를 엔티티로 만들어줌
        return Article.builder()
                .title(title)
                .content(content)
                .build();
    }
}
