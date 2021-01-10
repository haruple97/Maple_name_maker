package org.justice.maple_name_maker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private AdView mAdview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        mAdview = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdview.loadAd(adRequest);
        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("\n" + "ca-app-pub-3898269947993948~1266543117");







            //개발자 정보 버튼 클릭시 액티비티 전환
        Button developer_info_btn = (Button) findViewById(R.id.developer_info_btn);
        developer_info_btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Developer_info.class);
                startActivity(intent);
            }
        });


        //닉네임규정 버튼 클릭시 액티비티 전환
        Button name_rule_btn = (Button) findViewById(R.id.name_rule_btn);
        name_rule_btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Name_rule.class);
                startActivity(intent);
            }
        });



        //랜덤 함수 생성
        final Random rand = new Random();





        //앱 실행시 코디 랜덤 생성
        final int[] codi_img = {R.drawable.character_1, R.drawable.character_2, R.drawable.character_3, R.drawable.character_4
                , R.drawable.character_5, R.drawable.character_6, R.drawable.character_7, R.drawable.character_8
                , R.drawable.character_9, R.drawable.character_10, R.drawable.character_11, R.drawable.character_12
                , R.drawable.character_13, R.drawable.character_14, R.drawable.character_15, R.drawable.character_16
                , R.drawable.character_17, R.drawable.character_18, R.drawable.character_19, R.drawable.character_20
                , R.drawable.character_21, R.drawable.character_22, R.drawable.character_23, R.drawable.character_24
                , R.drawable.character_25, R.drawable.character_26, R.drawable.character_27, R.drawable.character_28
                , R.drawable.character_29, R.drawable.character_30, R.drawable.character_31, R.drawable.character_32
                , R.drawable.character_33, R.drawable.character_34, R.drawable.character_35, R.drawable.character_36
                , R.drawable.character_37, R.drawable.character_38, R.drawable.character_39, R.drawable.character_40
                , R.drawable.character_41, R.drawable.character_42, R.drawable.character_43, R.drawable.character_44
                , R.drawable.character_45, R.drawable.character_46, R.drawable.character_47, R.drawable.character_48
                , R.drawable.character_49, R.drawable.character_50, R.drawable.character_51, R.drawable.character_52
                , R.drawable.character_53, R.drawable.character_54, R.drawable.character_55, R.drawable.character_56
                , R.drawable.character_57, R.drawable.character_58, R.drawable.character_59, R.drawable.character_60
                , R.drawable.character_61, R.drawable.character_62, R.drawable.character_63, R.drawable.character_64
                , R.drawable.character_65, R.drawable.character_66, R.drawable.character_67, R.drawable.character_68
                , R.drawable.character_69, R.drawable.character_70, R.drawable.character_71, R.drawable.character_72
                , R.drawable.character_73, R.drawable.character_74, R.drawable.character_75, R.drawable.character_76
                , R.drawable.character_77, R.drawable.character_78, R.drawable.character_79, R.drawable.character_80};
        int num = rand.nextInt(codi_img.length);
        final ImageView main_img = (ImageView)findViewById(R.id.main_img);
        main_img.setBackgroundResource(codi_img[num]);



        //앱 실행시 서버 아이콘 랜덤 생성
        final int[] server_ico = {R.drawable.ico_world_arcane, R.drawable.ico_world_aurora, R.drawable.ico_world_bera
                , R.drawable.ico_world_croa, R.drawable.ico_world_elysium, R.drawable.ico_world_enosis, R.drawable.ico_world_luna
                , R.drawable.ico_world_nova, R.drawable.ico_world_reboot, R.drawable.ico_world_reboot2, R.drawable.ico_world_red
                , R.drawable.ico_world_scania, R.drawable.ico_world_union, R.drawable.ico_world_zenith};
        int server_num = rand.nextInt(server_ico.length);
        final ImageView server_img = (ImageView)findViewById(R.id.server_img);
        server_img.setBackgroundResource(server_ico[server_num]);


        //서버아이콘과 서버 이름 매칭시키는 소스코드
        final TextView server_text = (TextView)findViewById(R.id.server_text);

        if(server_ico[server_num] == R.drawable.ico_world_arcane){
            server_text.setText("아케인");
        }
        else if (server_ico[server_num] == R.drawable.ico_world_aurora){
            server_text.setText("오로라");
        }
        else if (server_ico[server_num] == R.drawable.ico_world_bera){
            server_text.setText("베라");
        }
        else if (server_ico[server_num] == R.drawable.ico_world_elysium){
            server_text.setText("엘리시움");
        }
        else if (server_ico[server_num] == R.drawable.ico_world_enosis){
            server_text.setText("이노시스");
        }
        else if (server_ico[server_num] == R.drawable.ico_world_luna){
            server_text.setText("루나");
        }
        else if (server_ico[server_num] == R.drawable.ico_world_nova){
            server_text.setText("노바");
        }
        else if (server_ico[server_num] == R.drawable.ico_world_reboot){
            server_text.setText("리부트");
        }
        else if (server_ico[server_num] == R.drawable.ico_world_reboot2){
            server_text.setText("리부트2");
        }
        else if (server_ico[server_num] == R.drawable.ico_world_red){
            server_text.setText("레드");
        }
        else if (server_ico[server_num] == R.drawable.ico_world_scania){
            server_text.setText("스카니아");
        }
        else if (server_ico[server_num] == R.drawable.ico_world_union){
            server_text.setText("유니온");
        }
        else if (server_ico[server_num] == R.drawable.ico_world_zenith){
            server_text.setText("제니스");
        }
        else if (server_ico[server_num] == R.drawable.ico_world_croa){
            server_text.setText("크로아");
        }







        //서버 변경 버튼 클릭이벤트
        Button server_change_btn = (Button)findViewById(R.id.server_change_btn);

        server_change_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int server_num = rand.nextInt(server_ico.length);
                server_img.setBackgroundResource(server_ico[server_num]);

                if(server_ico[server_num] == R.drawable.ico_world_arcane){
                    server_text.setText("아케인");
                }
                else if (server_ico[server_num] == R.drawable.ico_world_aurora){
                    server_text.setText("오로라");
                }
                else if (server_ico[server_num] == R.drawable.ico_world_bera){
                    server_text.setText("베라");
                }
                else if (server_ico[server_num] == R.drawable.ico_world_elysium){
                    server_text.setText("엘리시움");
                }
                else if (server_ico[server_num] == R.drawable.ico_world_enosis){
                    server_text.setText("이노시스");
                }
                else if (server_ico[server_num] == R.drawable.ico_world_luna){
                    server_text.setText("루나");
                }
                else if (server_ico[server_num] == R.drawable.ico_world_nova){
                    server_text.setText("노바");
                }
                else if (server_ico[server_num] == R.drawable.ico_world_reboot){
                    server_text.setText("리부트");
                }
                else if (server_ico[server_num] == R.drawable.ico_world_reboot2){
                    server_text.setText("리부트2");
                }
                else if (server_ico[server_num] == R.drawable.ico_world_red){
                    server_text.setText("레드");
                }
                else if (server_ico[server_num] == R.drawable.ico_world_scania){
                    server_text.setText("스카니아");
                }
                else if (server_ico[server_num] == R.drawable.ico_world_union){
                    server_text.setText("유니온");
                }
                else if (server_ico[server_num] == R.drawable.ico_world_zenith){
                    server_text.setText("제니스");
                }
                else if (server_ico[server_num] == R.drawable.ico_world_croa){
                    server_text.setText("크로아");
                }
            }
        });


        //캐릭터 코디 랜덤 변경 버튼
        Button character_design = (Button)findViewById(R.id.character_design);

        character_design.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int num = rand.nextInt(codi_img.length);
                main_img.setBackgroundResource(codi_img[num]);
            }
        });








        //한글 문자열 생성
        final String hangul = "가각간갇갈감갑값갓갔강개객갠갤갬갭갯갰갱갸갹갼갿걀걈걉걋걍" +
                "걔걕걘걩거걱걲걳건걷걸검겁것겄겅겆겇겈겉겊겋게겍겐겓겔겜겝겟겠겡겢겣겤겥겦겧겨격겪" +
                "견겯결겸겹겻경계곅곋곌곔곕곗곙고곡곤곧골곰곱곳공곶과곽관괄괌괍괏괐광괘괙괜괠괨괩괫" +
                "괭괴괵괸괼굄굅굇굉교굑굔굘굠굡굣굥구국군굳굴굵굶굼굽굿궁궂궃궅궈궉권궏궐궘" +
                "궙궛궝궤궥궨궷궹귀귁귄귇귈귐귑귓귕규귝균귣귤귬귭귯귱귲그극근글금급긋긍긔긕긘긧긩" +
                "기긱긴긷길김깁깃깅까깍깎깏깐깓깔깜깝깟깡깨깩깬깰깸깻깽꺄꺼꺽꺾껀껁껃껄" +
                "껌껑께껙껜꼬꼭꼰꼳꼴꼼꼽꼿꽁꽃꽈꽉꽌꽏꽐꽝꽤꽥꽷꽹꾀꾁꾄꾈꾐꾸꾹꾼꾿꿀꿈꿉꿔꿕" +
                "꿘뀌뀍뀨끄끅끈끌끼끽낀낄낌낑나낙낚낛난낟날남납낫났낭낮낯내낵낸낼냄냅냇냈냉냊냐냑냔" +
                "냘냠냡냣냤냥냦너넉넋넌넏널넘넙넛넜넝네넥넨넬넴넵넷넹녀녁년노녹논놀놈놉놋놌농놔놕놘" +
                "놜놤놥놧놩놰뇌뇐뇜뇨누눅눈눌눔눕눠눼뉘뉙뉴늄늉느늑는늘늠능늦늬니닉닌닏닐님닛닝다닥" +
                "닦단닫달닭담답닷닸당닺닿닮대댁댄댇댈댐댑댓댕댜댝댬댱더덕덖덗던덜덤덥덧덩덪데덱덴덷" +
                "델뎀뎁뎃뎅뎌뎨도독돈돋돌돔돕돗동돚돠돡돤돨돵돼돽됄됌됑되된됨됩됭됴둇둉두둑둔둗둘둠" +
                "둥둩둬둼둿뒈뒉뒤듀드득든듣들듬듭듯등듸듹딈딋딍디딕딘딛딜딤딥딧딩딪따딱딲딴딷딸땀땃" +
                "땅땆때땍땐땔땜땝땟땡땨땩떄떠떡떢떤떨떰떱떳떴떵떼떽뗀뗄뗌뗍뗑뗘뗜뗠뗴또똑똔똘똠똥똬" +
                "똭똰똴뙁뙤뚜뚝뚠뚤뚬뚱뛰뛴뜀뜌뜔뜡뜨뜩뜬뜰뜸뜽띠띡띤띨띰띱띵라락란랄람랍랏랐랑래랜" +
                "램랩랫랬랭랴략럄럅럇량러럭런럳럴럼럽럿렁레렉렌렘렙렝려력련렴렷령례로록론롤롯롱롸롹" +
                "뢍뢔뢩뢰료룡루룩룬룰룸룻룽뤄뤼뤽륀류르륵른름릉릐리릭린릳릴림립릿링마막만많말맘맙맛" +
                "망맞매맥맨맬맴맵맷맹맺먀먜머먹먼먿멀멈멉멋멌멍멎메멕멘멜멤멥멧멩며멱면몀몁몃명모목" +
                "몬몰몸몹못몽뫄뫅뫙뫠뫼묘무묵묶묷문묻물묽뭄뭉뭐뭘뭬뮈뮉뮤므믁믄믕믜미믹믿밀밈밋밍바" +
                "박밖받발밤밥밧방배백밴밷밸뱀뱁뱃뱅버벅번벌범법벗벙벚베벡벤벨벰벳벵벼벽변별볅볍볏병" +
                "볔볕보복본볼봄봅봇봉봐봣봤봥봬뵈뵤부북분불붐붓붜붸뷔뷰븅브븍븐블븨비빅빈빌빔빕빗빙" +
                "빚빠빡빼뺑뺘뻐뻑뻥뻬뼈뽀뽁뽐뽕뽜뾰뾱뿅뿌뿍뿜뿡쀠쀼쀽쁘쁙쁨삐삑삥사삭삯산삳살삵삶삼" +
                "삽삿상새색샌샐샘샙생샤샨샵서석선설섬섭성세섹센셀셈셋셍셔셩소속손솔솜솟송솨솩솬솽쇄" +
                "쇅쇠쇡쇰쇼숍숏숑수숙숟술숨숫숭숴숼쉐쉑쉬쉭쉰쉴쉼슈슉스슥슨슬슴습슷승싀시식신싣실싯" +
                "싱싸싹싼싿쌀쌈쌉쌋쌔쌩써썪썬썯썰썸썻썼썽쎄쏘쏴쐐쐬쑈쑥쑨쑬쑴쓰쓱쓴쓸씀씨씸씽아악안" +
                "앉않앋알앍앎암압앗았앙애액앤앧앨앰앱앳앴야얀얄얌얍얏양얘얜얠어억언얻얼에엑엔엗엘엥" +
                "여역연열염엽엿영예옛오옥온옫올옴옷옹와왁완왈왕왜왝외왼욈요욜우욱운워웍원월웨웩위윅" +
                "유율으윽은음읍응의이익인일임입잇있잉자작잔잘잠잡잣잤장재잭잰잴잼잽잿쟁쟈쟤저적전절" +
                "점접젓정젖제젝젠젤젬져조족존좀좁종좌좜좨죄죙주죽준줄줌줍중줘쥐쥠쥬즈즉즌즐지직진질" +
                "짐집짓징짜짝짠짤짱째짹짼쨀쨈쨉쨔쩌쩍쩔쩜쩝쩡쩨쪄쪼쪽쫀쫃쫄쫍쫘쫙쬐쬬쭈쭉쭝쭤쮸쯔쯤" +
                "쯩찌찍찐찔찜차착찬참찹찻창찾채책챈챌챔챠처척천철첨첫체첵첸첼쳇쳉초촉촌촐촘총촤촥촬" +
                "최추축출춤춰취츄츠측치칙친칠침칩칫칭카칵칸칼캄캅캉캐캑캔캗캘캠캡캣캬컁커컨컬컴컵케" +
                "켁켜코콕콘콜콰콱쾅쾌쿄쿠쿡쿨쿵퀘퀴퀵큐크큼키킥킨킬킷킹타탄탄탈탐탑탓탕태택탠탤탬탭" +
                "탯탱터턱턴털텀텁텃텅테텍텔토톤톳톱톳통톼퇘퇭퇴툉툐투툭툿퉁튀튜트틈티틱틴틸팀팁팅파" +
                "팍팔팜팝팟팡팥패팸팽퍄퍼펌펍펏펑페펜펴편폐펭포폭폴폼폽폿퐁퐈푀푈표푭푸푹푼풀품풋풍" +
                "퓌퓍퓨프픅픈플픔피픽핀필핌핍핏핑하학할함핫항해핵핼햄햅햇행햐햠향허헉헌헐험헤헥헬헴" +
                "헷헹혀혁현혈혐협혓형혜호혹혼홀홈홉화확환활홧황홰홱홴횅회획횐횜횝횟횡효후훅훈훌훍훔" +
                "훗훙훠훼훽휑휘휠휨휫휭휴휸흄흉흐흑흔흘흠흡흣흥희흰힁히힉힌힐힘힙힛힝";




        //닉네임 생성하기 버튼
        final Button make_name = (Button) findViewById(R.id.make_name);

        final TextView text_make_name = (TextView)findViewById(R.id.text_make_name);

        //라디오 그룹 변수
        final RadioGroup rd_name_number = (RadioGroup)findViewById(R.id.rd_name_number);



        //라디오 버튼 변수
        final RadioButton rd_num_2 = findViewById(R.id.rd_num_2);
        final RadioButton rd_num_3 = findViewById(R.id.rd_num_3);
        final RadioButton rd_num_4 = findViewById(R.id.rd_num_4);
        final RadioButton rd_num_5 = findViewById(R.id.rd_num_5);
        final RadioButton rd_num_6 = findViewById(R.id.rd_num_6);





        int id = rd_name_number.getCheckedRadioButtonId();
        //getCheckedRadioButtonId() 의 리턴값은 선택된 RadioButton 의 id 값.
        RadioButton number = (RadioButton) findViewById(id);






        make_name.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
//랜덤버튼 선택 되었다면
                if(rd_num_2.isChecked()){
                    //클릭했을 때 랜덤생성 될 수 있도록 여기에 랜덤함수 선언
                    char rand_text_1 = hangul.charAt(rand.nextInt(hangul.length()));
                    char rand_text_2 = hangul.charAt(rand.nextInt(hangul.length()));
                    text_make_name.setText(String.valueOf(rand_text_1)+String.valueOf(rand_text_2));

                }
                else if(rd_num_3.isChecked()){
                    char rand_text_1 = hangul.charAt(rand.nextInt(hangul.length()));
                    char rand_text_2 = hangul.charAt(rand.nextInt(hangul.length()));
                    char rand_text_3 = hangul.charAt(rand.nextInt(hangul.length()));
                    text_make_name.setText(String.valueOf(rand_text_1)+String.valueOf(rand_text_2)+
                            String.valueOf(rand_text_3));

                }
                else if(rd_num_4.isChecked()){
                    char rand_text_1 = hangul.charAt(rand.nextInt(hangul.length()));
                    char rand_text_2 = hangul.charAt(rand.nextInt(hangul.length()));
                    char rand_text_3 = hangul.charAt(rand.nextInt(hangul.length()));
                    char rand_text_4 = hangul.charAt(rand.nextInt(hangul.length()));
                    text_make_name.setText(String.valueOf(rand_text_1)+String.valueOf(rand_text_2)+
                            String.valueOf(rand_text_3)+String.valueOf(rand_text_4));
                }

                else if(rd_num_5.isChecked()){
                    char rand_text_1 = hangul.charAt(rand.nextInt(hangul.length()));
                    char rand_text_2 = hangul.charAt(rand.nextInt(hangul.length()));
                    char rand_text_3 = hangul.charAt(rand.nextInt(hangul.length()));
                    char rand_text_4 = hangul.charAt(rand.nextInt(hangul.length()));
                    char rand_text_5 = hangul.charAt(rand.nextInt(hangul.length()));
                    text_make_name.setText(String.valueOf(rand_text_1)+String.valueOf(rand_text_2)+
                            String.valueOf(rand_text_3)+String.valueOf(rand_text_4)+String.valueOf(rand_text_5));

                }
                else if(rd_num_6.isChecked()){
                    char rand_text_1 = hangul.charAt(rand.nextInt(hangul.length()));
                    char rand_text_2 = hangul.charAt(rand.nextInt(hangul.length()));
                    char rand_text_3 = hangul.charAt(rand.nextInt(hangul.length()));
                    char rand_text_4 = hangul.charAt(rand.nextInt(hangul.length()));
                    char rand_text_5 = hangul.charAt(rand.nextInt(hangul.length()));
                    char rand_text_6 = hangul.charAt(rand.nextInt(hangul.length()));
                    text_make_name.setText(String.valueOf(rand_text_1)+String.valueOf(rand_text_2)+
                            String.valueOf(rand_text_3)+String.valueOf(rand_text_4)+String.valueOf(rand_text_5)+String.valueOf(rand_text_6));
                }
                //아무것도 선택되지 않았다면
                else{
                    Toast.makeText(getApplicationContext(),"글자 수를 선택하십시오",Toast.LENGTH_SHORT).show();
                }
            }


        });


    }
}
