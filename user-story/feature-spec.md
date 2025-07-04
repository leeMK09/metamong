## 사용자 정보

- 이메일 관리
  - 효율적인 사용자 관리 고려필요함
  - 사용자 회원가입 및 로그인은 추후 서드파티 계정으로 연동 필요 → 자체 회원가입은 서비스 진입장벽이 있어보임

</br>

## 사용자 입력

- 이력서 업로드
  - 사용자의 이력서를 업로드한 후 텍스트를 추출 및 분석
  - 입력은 PDF 파일 (v1.0)
  - 처리 흐름
    - PDF → 텍스트 추출 → 키워드 분석
- 자기소개서 입력
  - TextArea 입력
  - 처리 흐름
    - 텍스트 추출 → 키워드 분석
- 질문지 응답
  - v1.0 에서는 제공 X → 데이터가 쌓인 이후 객관적인 지표 기반 질문지 생성 필요
  - 혹은 일반적인 질문지 생성 고려필요

</br>

## 사용자 입력에 의한 결과

- 키워드 목록 저장
  - 추후 리포트 활용 및 조회
- 장점, 단점, 성향, 행동스타일, 추천 인재상, 키워드와 관련된 아티클, 관련된 채용공고
  - AI API 활용 고려
  - 비용 고려하여 최대 사용량 책정
    - 이를 기반으로 사용자 관리를 생각해야할듯
- 채용공고 추천
  - 관련하여 API 확인 및 다른 방안 고려 필요
  - 다른 방식으로 제공하는 방법도 고려해볼 필요가 있음

**리포트**

- 장점, 단점, 키워드 조회
  - 이메일을 통해 리포트 생성
  - 그래프 형태 or 통계형 UI 필요
- 키워드 조회
  - 키워드 목록 조회 → 이메일 발송
- 추천 아티클, 기업 목록
  - 추천 아티클 및 기업 목록 분석 → 이메일 발송

</br>

**문제사항**

현 시점에서 비용

비용을 효율적으로 처리할 방안이 필요해보이며 사용자의 제한량이 무조건 고려되어야 함
이로 인해 사용자의 권한 및 인증, 인가 정책이 필요해보임

or

MVP 단게이므로 전체 사용량을 고정으로 정해놓고 공유
