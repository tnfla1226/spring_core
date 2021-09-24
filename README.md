
# 스프링 코어 학습
- [스프링프로젝트 생성 사이트] (https://start.spring.io)
- [라이브러리 다운로드 사이트] (https://mvnrepository.com)

## lombok 설정
1. build.gradle -> dependencies에 추가
```groovy
//lombok 라이브러리
compileOnly 'org.projectlombok:lombok:1.18.12'
annotationProcessor 'org.projectlombok:lombok:1.18.12'
```

2. 인텔리제이 shift두번 눌러서 검색창에 '플러그인' 검색 후 lombok 플러그인 설치