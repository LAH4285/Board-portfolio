package com.example.demo.dto;


import com.example.demo.entity.BoardFile;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
@NoArgsConstructor
public class FileDTO {

    // ** 파일 경로
    private String filePath;

    // ** 파일 이름
    private String fileName;

    // ** 파일 포멧
    private String fileType;

    // ** uuid(random key)
    private String uuid;

    // ** 파일 크기
    private Long fileSize;

    // ** 게시물 id
    private Long boardId;

    public BoardFile toEntity() {
        return BoardFile.builder()
                .filePath(filePath)
                .fileName(fileName)
                .fileType(fileType)
                .uuid(uuid)
                .fileSize(fileSize)
                .build();
    }
}









