## git-flow

Git-flow에는 5가지 종류의 브랜치가 존재합니다. 항상 유지되는 메인 브랜치들(master, develop)과 일정 기간 동안만 유지되는 보조 브랜치들(feature, release, hotfix)이 있습니다.

master : 제품으로 출시될 수 있는 브랜치  
develop : 다음 출시 버전을 개발하는 브랜치  
feature : 기능을 개발하는 브랜치  
release : 이번 출시 버전을 준비하는 브랜치  
hotfix : 출시 버전에서 발생한 버그를 수정 하는 브랜치  

### git flow를 설명하는 대표적인 그림
![git-flow](https://user-images.githubusercontent.com/43161981/77248162-aba8d580-6c7a-11ea-8924-f354c4a39880.png)  
#### 위 그림을 따라서 실습  

### 1. issue 생성
![issues](https://user-images.githubusercontent.com/43161981/77248325-e95a2e00-6c7b-11ea-91e9-414b7af900a0.png)

![sub_issue](https://user-images.githubusercontent.com/43161981/77248379-51107900-6c7c-11ea-814e-980305fd5fb4.png)


### 2. develop branch에 feature/sub, feature/b, feature/c branch 머지 후 커밋 그래프  
![featureC](https://user-images.githubusercontent.com/43161981/77248306-c465bb00-6c7b-11ea-8810-7499bf731e75.png)

### 3. release-1.0.0 branch에서 master branch로 머지 후 커밋 그래프
![master1 0 0](https://user-images.githubusercontent.com/43161981/77248428-9cc32280-6c7c-11ea-9667-bed24166b370.png)
