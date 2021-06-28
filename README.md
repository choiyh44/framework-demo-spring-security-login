# framework-demo-spring-security-login
## Spring security를 활용한 form login을 위한 최소(?) 설정

1. pom.xml에 디펜던시를 추가한다.
```
	<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.security</groupId>
			<artifactId>spring-security-test</artifactId>
			<scope>test</scope>
		</dependency>
```

2. security config를 작성한다.
```
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
...
  @Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
			.authorizeRequests()
				.antMatchers("/", "/home").permitAll()
				.anyRequest().authenticated()
				.and()
			.formLogin()
				.loginPage("/login")
        .permitAll()
        .and()
      .logout()
        .permitAll();
	}
```

권한설정/로그인폼페이지설정/로그아웃설정을 추가했다.

3. @EnableWebSecurity 어노테이션을 추가해서 spring security를 활성화한다.
```
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
  ...
```

4. 사용자 정보(이름/비밀번호/...) 조회를 위한 dao 를 지정한다.
```
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private CustomUserDetailsService userDetailsService;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService);
	}
  ...
```

5. 비밀번호 암호화 메소드를 등록한다. 
```
  ...
  @Bean
  public PasswordEncoder passwordEncoder(){
    return new BCryptPasswordEncoder();
  }
```


