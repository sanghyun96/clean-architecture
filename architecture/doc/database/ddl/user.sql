drop table if exists user cascade;

-- 사용자 기본정보
create table user (
	user_id						varchar(32),
	user_group_id				integer								not null,
	user_name					varchar(64)							not null,
	password					varchar(512)						not null,
	phone_number				varchar(256),
	email						varchar(256),
	address						varchar(256),
	status						varchar(30)							default 'USE',
	login_count					integer								default 0,
	fail_login_count			integer								default 0,
	last_login_date				timestamp with time zone,
	last_password_change_date	timestamp with time zone			default now(),
	modified_date				timestamp with time zone,
	created_date				timestamp with time zone			default now(),
	constraint user_pk primary key(user_id)
);

comment on table user is '사용자 기본정보';
comment on column user.user_id is '고유번호';
comment on column user.user_group_id is '사용자 그룹 고유번호';
comment on column user.user_name is '이름';
comment on column user.password is '비밀번호';
comment on column user.phone_number is '핸드폰 번호';
comment on column user.email is '이메일';
comment on column user.address is '주소';
comment on column user.status is '사용자 상태. USE:사용중, PERMISSION_DENIED:사용중지, EXCEEDED_RETRIES:비밀번호 실패 횟수 초과, UNUSED:휴먼 상태, EXPIRED:사용기간 종료, LOGICAL_DELETE:삭제(화면 비표시), TEMP_PASSWORD:임시 비밀번호, WAITING_APPROVAL:승인대기';
comment on column user.login_count is '로그인 횟수';
comment on column user.fail_login_count is '로그인 실패 횟수';
comment on column user.last_login_date is '마지막 로그인 날짜';
comment on column user.last_password_change_date is '마지막 로그인 비밀번호 변경 날짜';
comment on column user.modified_date is '개인정보 수정 날짜';
comment on column user.created_date is '등록일';
