package controllers.app;  //

/**
 * OPT常量值
 * Description:
 * @author zhs
 * vesion: 6.0 
 * @date 2014-9-16 下午04:06:46
 */
public class AppConstants {
	public static final int APP_LOGIN = 1;  //登录
	public static final int APP_REGISTER = 2;  //注册
	public static final int APP_BASEINFO = 3;  //账户基本信息
	public static final int APP_FIND_PWD_BY_SMS = 4;  //发送短信验证码
	public static final int APP_CONFIRM_CODE = 5;  //找回密码-验证码确认
	public static final int APP_COMMIT_NEW_PWD = 6;  // 重置密码-提交新密码
	public static final int APP_SAVE_CELLPHONE = 7;  //绑定手机号码
	public static final int APP_SERVICE_AGREEMENT = 8;  //注册服务协议
	public static final int APP_REPAYMENT_CALCULATOR = 9;  //还款计算器
	public static final int APP_ALL_BIDS = 10;  //查询借款标列表
	public static final int APP_BID_DETAIL = 11;  //借款标详情
	public static final int APP_INVEST_BID_RECORD = 12;  //查询借款标投标记录
	public static final int APP_ALL_QUESTION = 13;  //查询借款标提问以及回答列表
	public static final int APP_ADD_QUESTIONS = 14;  //查询借款标提问记录
	public static final int APP_INVEST_DETAIL = 15;  //投标详情
	public static final int APP_INVEST = 16;  // 投标操作
	public static final int APP_UPLOAD_IMG = 17;  //上传图片
	public static final int APP_LOAN_PRODUCT = 18;  //借款产品列表
	public static final int APP_PRODUCT_INFO = 19;  //借款标产品详情
	public static final int APP_PRODUCT_DETAIL = 20;  //获取借款产品信息
	public static final int APP_CREATE_BID = 21;  //发布借款
	public static final int APP_APR_CALCULATOR = 22;  //利率计算器
	public static final int APP_USER_STATUS = 23;  //获取完善用户资料状态
	public static final int APP_SAVE_BASEINFO = 24;  //完善用户资料
	public static final int APP_ACTIVE_EMAIL = 25;  //通过后台发送激活邮件
	public static final int APP_VIP_APPLY = 26;  //申请vip
	public static final int APP_VIP_AGREEMENT = 27;  //VIP会员服务条款
	public static final int APP_TWO_DIMENSIONANL_CODE = 28;  //二维码
	public static final int APP_SPREAD_USER = 29;  //我推广的会员列表
	public static final int APP_ALL_DEBTS = 30;  //查询所有债权
	public static final int APP_DEBT_DETAIL = 31;  //债权转让标详情
	public static final int APP_DEBTAUCTION_RECORDS = 32;  //债权竞拍记录
	public static final int APP_ACTION_DEBT_DETAIL = 33;  // 获取竞拍相关信息
	public static final int APP_AUCTION = 34;  //债权竞拍
	public static final int APP_INVEST_BILLS = 35;  //理财子账户--理财账单
	public static final int APP_BILL_DETAIL = 36;  // 账单详情
	public static final int APP_CURRENT_BILL_DETAIL = 37;  //本期账单明细
	public static final int APP_BILL_BID_DETAIL = 38;  //账单借款标详情
	public static final int APP_HISTORY_REPAYMENT = 39;  // 账单历史还款情况
	public static final int APP_INVEST_RECORDS = 40;  //理财子账户--投标记录
	public static final int APP_LOANING_INVEST_BIDS = 41;  //理财子账户--等待满标的理财标
	public static final int APP_RECEVING_INVEST_BIDS = 42;  //理财子账户---收款中的理财标列表
	public static final int APP_TRANSFER_DEBT = 43;  //转让债权
	public static final int APP_SUCCESS_DEBT = 44;  // 理财子账户--已成功的理财标
	public static final int APP_DEBT_TRANSFER = 45;  //债权转让管理
	public static final int APP_DEBT_DETAILS_SUCCESS = 46;  //债权转让成功详情页面
	public static final int APP_SUCCESS_DEBT_DETAILS = 47;  //债权转让中详情页面
	public static final int APP_DEBT_DETAILS_NO_PASS = 48;  //债权转让不通过详情页面
	public static final int APP_DEBT_TRANSFER_DETAIL = 49;  //债权转让详情
	public static final int APP_DEBT_TRANSFER_BID_DETAIL = 50;  //债权转让借款标详情页面
	public static final int APP_TRANSACT = 51;  //成交债权
	public static final int APP_ACTION_RECORDS = 52;  // 查询债权竞拍记录
	public static final int APP_RECEIVED_DEBT_TRANSFER = 53;  //查询用户受让债权管理列表
	public static final int APP_RECEIVE_DEBT_DETAIL_SUCCESS= 54;  //受让债权的详情 [竞拍成功]
	public static final int APP_RECEIVE_DEBT_DETAIL_AUCTION = 55;  //受让债权的详情 [竞拍中]
	public static final int APP_RECEIVE_DEBT_DETAIL = 56;  //债权受让详情 [竞拍成功,竞拍中,定向转让]
	public static final int APP_RECEIVE_DEBT_BID_DETAIL = 57;  //受让的借款标详情 [竞拍成功,竞拍中,定向转让]
	public static final int APP_INCREASE_ACTION = 58;  //加价竞拍
	public static final int APP_ACCEPT_DEBTS = 59;  //接受定向转让债权
	public static final int APP_NOT_ACCEPT = 60;  //拒绝接受定向债权转让
	public static final int APP_INVEST_STATISTICS = 61;  //理财情况统计表
	public static final int APP_UPDATE_ROBOTS = 62;  //设置投标机器人
	public static final int APP_AUTO_INVEST = 63;  //进入自动投标页面
	public static final int APP_CLOSE_ROBOT = 64;  //关闭投标机器人
	public static final int APP_ATTENTION_DEBTS = 65;  //收藏的债权列表
	public static final int APP_ATTENTION_BIDS = 66;  //收藏的借款标
	public static final int APP_ATTENTION_USERS_LSIT = 67;  //查询用户关注用户列表
	public static final int APP_BLACK_LIST = 68;  //用户黑名单
	public static final int APP_REPORT_USERS = 69;  //举报用户
	public static final int APP_ADD_BLACK = 70;  //拉黑对方
	public static final int APP_ATTENTION_USERS = 71;  // 关注用户
	public static final int APP_COLLECT_BID = 72;  //收藏借款标
	public static final int APP_COLLECT_DEBT = 73;  //收藏债权
	public static final int APP_HELP_CENTER = 74;  //进入帮助中心页面
	public static final int APP_HELP_CENTER_CONTENT = 75;  //帮助中心内容列表
	public static final int APP_HELP_CENTER_DETAIL = 76;  //帮助中心列表详情
	public static final int APP_COMPANY_INTRODUCTION = 77;  //关于我们---公司介绍
	public static final int APP_MANAGEMENT_TEAM = 78;  //关于我们---管理团队
	public static final int APP_EXPER_ADVISOR = 79;  //关于我们---专家顾问
	public static final int APP_SEND_STATION = 80;  //发送站内信
	public static final int APP_SYSTEM_SMS = 81;  //系统信息接口
	public static final int APP_DELETE_SYSTEM_SMS = 82;  //删除系统信息接口
	public static final int APP_INBOX_SMGS = 83;  //收件箱信息
	public static final int APP_DELETE_INBOX_SMGS = 84;  //删除收件箱信息接口
	public static final int APP_MARK_MSGS_READED = 85;  //标记为已读
	public static final int APP_MARK_MSGS_UNREAD = 86;  //标记为未读
	public static final int APP_LOAN_BILLS = 87;  //借款账单
	public static final int APP_LOAN_BILL_DETAILS = 88;  //借款账单详情
	public static final int APP_SUBMIT_REPAYMENT = 89;  //还款
	public static final int APP_AUDITING_LOAN_BIDS = 90;  //审核中的借款标列表
	public static final int APP_AUDITING_BIDS = 91;  // 等待满标的借款标列表
	public static final int APP_REPAYMENT_BIDS = 92;  //还款中的借款标列表
	public static final int APP_SUCCESS_BIDS = 93;  //已成功的借款标列表
	public static final int APP_AUDIT_MATERIALS = 94;  //审核资料认证
	public static final int APP_AUDIT_MATERIALS_SAMEITEM = 95;  //审核资料认证详情
	public static final int APP_SPREAD_USER_INCOME = 96;  // 我推广的收入接口
	public static final int APP_DEAL_RECORD = 97;  //交易记录
	public static final int APP_BANK_INFO = 98;  //银行卡管理
	public static final int APP_ADD_BANK = 99;  //添加银行卡
	public static final int APP_EDIT_BANK = 100;  //编辑银行卡
	public static final int APP_QUERY_ANSWERS = 101;  //查询安全问题
	public static final int APP_VERIFYE_QUESTION = 102;  //校验安全问题
	public static final int APP_SAVE_PAY_PWD = 103;  //保存交易密码
	public static final int APP_EDIT_PAY_PWD = 104;  //修改交易密码
	public static final int APP_SAVE_PWD = 105;  //保存登录密码
	public static final int APP_QUESTION_STATUS = 106;  //安全问题设置的状态
	public static final int APP_QUESTION_CONTENT = 107;  //获取安全问题内容
	public static final int APP_SAVE_SAFE_QUESTION = 108;  //设置安全问题内容
	public static final int APP_EMAIL_STATUS = 109;  //邮箱激活状态
	public static final int APP_SAVE_EMAIL = 110;  //修改邮箱
	public static final int APP_PHONE_STATUS = 111;  //安全手机详情及状态
	public static final int APP_MY_CREDIT = 112;  //我的信用等级
	public static final int APP_VIEW_CREDIT_RULE = 113;  //查看信用等级规则
	public static final int APP_CREDIT_INTEGRAL = 114;  //查看信用积分规则
	public static final int APP_AUDIT_ITEM_SCORE = 115;  //审核资料积分明细
	public static final int APP_CREDIT_DETAIL_REPATMENT = 116;  //正常还款积分明细
	public static final int APP_CREDIT_DETAIL_LOAN = 117;  //成功借款积分明细
	public static final int APP_CREDIT_DETAIL_INVEST = 118;  //成功投标积分明细
	public static final int APP_CREDIT_DETAIL_OVERDUE = 119;  //逾期扣分积分明细
	public static final int APP_APPLY_FOR_OVER_BORROW = 120;  //申请超额借款
	public static final int APP_OVER_BORROW_LIST = 121;  //申请超额借款记录列表
	public static final int APP_HOME = 122;  // 首页
	public static final int APP_SELECT_AUDIT_ITEMS_INIT = 123;  //选择超额借款审核资料库
	public static final int APP_WEALTH_TOOLKIT_CREDIT_CALCULATOR = 124;  //信用计算器规则
	public static final int APP_RECRUITMENT = 125;  //关于我们---招贤纳士
	public static final int APP_PARTNERS = 126;  // 关于我们---合作伙伴
	public static final int APP_VERSION = 127;  //获取APP版本
	public static final int APP_SERVICE_HOTLINE = 128;  //获取客服热线
	public static final int APP_NEWS_DETAIL = 129;  //财富资讯新闻详情
	public static final int APP_WEALTH_INFO_HOME = 130;  //财富资讯首页
	public static final int APP_WEALTH_INFO_NEWS_LIST = 131;  //富资讯各个栏目下的新闻列表
	public static final int APP_RESET_SAFE_QUESTION = 132;  //通过邮箱重置安全问题
	public static final int APP_DELETE_BANK = 133;  //删除银行卡
	public static final int APP_OUTBOX_MSGS= 134;  //发件箱信息
	public static final int APP_OUTBOX_MSGS_DETAIL= 135;  //发件箱详情
	public static final int APP_SYSTEM_MSGS_DETAIL= 136;  //系统邮件详情
	public static final int APP_INBOX_MSGS_DETAIL= 137;  //收件箱详情
	public static final int APP_USER_INFO_STATUS= 138;  //用户状态
	public static final int APP_KITNET_CALCULATOR= 139;  //净值计算器
	public static final int APP_BID_QUESTIONS= 140;  //针对当前用户的所有借款提问
	public static final int APP_BID_QUESTIONS_DETAILS= 141;  //提问详情
	public static final int APP_CREDIT_ITEM= 142;  //审核科目积分明细
	public static final int APP_VIEW_OVER_BORROW= 143;  //查看超额申请详情
	public static final int APP_SUBMIT_WITHDRAWAL= 144;  //提现申请
	public static final int APP_WITHDRAWAL= 145;  //提现初始信息
	public static final int APP_WITHDRAWAL_RECORDS= 146;  //提现记录
	public static final int APP_FILE= 147;  //上传图片
	public static final int APP_DELETE_OUTBOX_SMGS= 148;  //删除发件箱站内信
	public static final int APP_OFFICIAL_ACTIVITY= 149;  //官方活动首页查询
	public static final int APP_CANCEL_ATTENTION_USERS= 150;  //取消关注用户
	public static final int APP_VIP_FEE= 151;  //获取vip相关信息
	public static final int APP_DELETE_BLACKLIST= 152;  //删除黑名单
	public static final int APP_DELETE_ATTENTION_BID= 153;  //删除收藏的标
	public static final int APP_DELETE_ATTENTION_DEBT= 154;  //删除收藏的标
	public static final int APP_PUSH_SETTINT= 155;  //保存推送设置
	public static final int APP_PUSH_QUERY= 156;  //获取推送设置
	public static final int APP_AUDIT_ITEMS= 157;  //提交用户未交费资料
	public static final int APP_FIRST_DEAl_DEBT = 158;  //债权用户初步成交债权，之后等待竞拍方确认成交
	public static final int APP_AUDIT_SUBMIT_UPLOADED_ITEMS = 159;  //提交用户资料
	public static final int APP_CLEAR_AUDIT_ITEMS = 160;  //用户取消提交资料
	public static final int APP_START_MAP = 161;  //APP用户启动图
	public static final int APP_ALL_PRODUCTS = 162;  //借款标类型
	public static final int APP_ALL_REPAYMENT_TYPES = 163;  //还款方式
	public static final int APP_ACOUNT_CAPITAL = 164;  //资金管理页面
	public static final int APP_ACOUNT_INCOME = 165; //查询收益查询
	public static final int APP_REGISTER_MOBILE = 166; //手机号码注册
	public static final int APP_BANK_PROVINCE_LIST = 167; //获取银行城市列表
	public static final int APP_PROVINCE_LIST = 168; //获取省份
	public static final int APP_CITY_LIST = 169; //获取城市
	public static final int APP_ADD_BANCARD_INFO = 170; //添加银行卡信息
	public static final int APP_BANK_LIST = 171; //获取银行列表
	public static final int APP_UPDATE_EMAIL = 172; //修改邮箱
	public static final int APP_UPDATE_MOBILE = 173; //修改手机号
	public static final int APP_PLATFORM_INFO = 174; //修改手机号
}
