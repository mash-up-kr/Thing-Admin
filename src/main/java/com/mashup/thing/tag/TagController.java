package com.mashup.thing.tag;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TagController {

    private final TagService tagService;

    public TagController(TagService tagService) {
        this.tagService = tagService;
    }

    @GetMapping("/v1/tags")
    public ResponseEntity<ResTagsDto> getCategoryRankings() {
        return ResponseEntity.status(HttpStatus.OK).body(tagService.getTags());
    }
}
