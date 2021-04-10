
## 메이플 작명소 - 게임 닉네임 생성


### 로고
<img src = "https://user-images.githubusercontent.com/73948775/104123740-443a4e80-5390-11eb-855b-1f02b392a50e.jpg" width="300px">
<br/>

### 화면 스크린샷
<img src = "https://user-images.githubusercontent.com/73948775/114273686-04016f80-9a56-11eb-9022-491b2407dfa7.png" width="300px">

> 기능
- 닉네임 랜덤 생성
- 캐릭터 디자인 랜덤 생성
- 서버 랜덤 생성


<br/>

### 닉네임 랜덤생성

<img src = "https://user-images.githubusercontent.com/73948775/114274527-c56db400-9a59-11eb-8f6c-3ad1aaa99ebb.png" width="400px">


```sh
아스키코드의 한글에는 '꽗뚫쫡' 등과 같이 실제로는 사용하지 않는 단어가 굉장히 많습니다.
이러한 단어는 실제 게임 닉네임에도 적용할 수 없습니다.
약 11,000자의 아스키코드 한글단어 중 실제로 사용되는 단어만을 추출하여 소스코드에 적용하였습니다.
```
<br/>

예시

```sh

int id = rd_name_number.getCheckedRadioButtonId();
//getCheckedRadioButtonId() 의 리턴값은 선택된 RadioButton 의 id 값.
RadioButton number = (RadioButton) findViewById(id);

// 문자열 생성
final String hangul = "가각간갇갈감갑값갓갔강개객갠갤갬갭갯갰갱갸갹갼갿걀걈걉걋걍" +
                "걔걕걘걩거걱걲걳건걷걸검겁것겄겅.......힝";
                
// 클릭 이벤트
 make_name.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
//랜덤버튼 선택 되었다면
                if(rd_num_2.isChecked()){ // 2 클릭 시 문자 2개 생성
                    //클릭했을 때 랜덤생성 될 수 있도록 랜덤함수 선언
                    char rand_text_1 = hangul.charAt(rand.nextInt(hangul.length()));
                    char rand_text_2 = hangul.charAt(rand.nextInt(hangul.length()));
                    text_make_name.setText(String.valueOf(rand_text_1)+String.valueOf(rand_text_2));

                }
                else if(rd_num_3.isChecked()){ // 3 클릭 시 문자 2개 생성
                    char rand_text_1 = hangul.charAt(rand.nextInt(hangul.length()));
                    char rand_text_2 = hangul.charAt(rand.nextInt(hangul.length()));
                    char rand_text_3 = hangul.charAt(rand.nextInt(hangul.length()));
                    text_make_name.setText(String.valueOf(rand_text_1)+String.valueOf(rand_text_2)+
                            String.valueOf(rand_text_3));

                }
                .... 반복해서 6까지 진행
                
```



<br/>


### 코디 랜덤생성
```sh
캐릭터 코디 이미지를 drawble 폴더에 넣습니다. 이미지 명은 'character_(숫자)' 로 명하였습니다.
랜덤함수를 사용하여 앱 실행시 및 '코디바꾸기' 버튼 클릭 시 코디가 변경되도록 하였습니다.
```
<img src = "https://user-images.githubusercontent.com/73948775/114274475-7aec3780-9a59-11eb-97e6-66ca85e79cce.png" width="150px">

```sh
        //앱 실행시 코디 랜덤 생성
        final int[] codi_img = {R.drawable.character_1, R.drawable.character_2,
                                R.drawable.character_3, R.drawable.character_4,
                                R.drawable.character_5, R.drawable.character_6,
                                R.drawable.character_7, R.drawable.character_8 ...};
                
        int num = rand.nextInt(codi_img.length);
        final ImageView main_img = (ImageView)findViewById(R.id.main_img);
        main_img.setBackgroundResource(codi_img[num]);
```
<br/>


### 문의

  - 메일 : haruple97@naver.com
  - 카카오톡 : 946837
  - 블로그 : https://haruple.tistory.com/
  - 유튜브 : https://www.youtube.com/channel/UCI9vrgDbeFdsrQEk-4RWoiA
