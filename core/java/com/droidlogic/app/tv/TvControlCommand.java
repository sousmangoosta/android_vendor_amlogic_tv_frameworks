package com.droidlogic.app.tv;

public interface TvControlCommand {
    // Tv function
    int OPEN_TV = 1;
    int CLOSE_TV = 2;
    int START_TV = 3;
    int STOP_TV = 4;
    int GET_TV_STATUS = 5;
    int GET_LAST_SOURCE_INPUT = 6;
    int GET_CURRENT_SOURCE_INPUT = 7;
    //int GET_CURRENT_SOURCE_INPUT_TYPE = 8;
    int GET_CURRENT_SIGNAL_INFO = 9;
    //int IS_SOURCE_SWTICH_DONE = 10;
    int SET_SOURCE_INPUT = 11;
    //int RUN_ADC_AUTO_CALIBRATION = 12;
    int IS_DVI_SIGNAL = 13;
    int IS_VGA_TIMEING_IN_HDMI = 14;
    int GET_VIDEO_PATH_STATUS = 15;
    //int GET_VIDEO_STREAM_STATUS = 16;
    int SET_PREVIEW_WINDOW_MODE = 17;
    int SET_PREVIEW_WINDOW = 18;
    int GET_SOURCE_CONNECT_STATUS = 19;
    int GET_SOURCE_INPUT_LIST = 20;
    // Tv function END

    // HDMI
    int SET_HDMI_EDID_VER = 44;
    int SET_HDCP_KEY_ENABLE = 45;
    int SET_HDMI_COLOR_RANGE_MODE = 46;
    int GET_HDMI_COLOR_RANGE_MODE = 47;

    // PQ
    //int SET_SCENEMODE = 192;
    //int GET_SCENEMODE = 193;
    int SET_BRIGHTNESS = 194;
    int GET_BRIGHTNESS = 195;
    int SAVE_BRIGHTNESS = 196;
    int SET_CONTRAST = 197;
    int GET_CONTRAST = 198;
    int SAVE_CONTRAST = 199;
    int SET_SATURATION = 200;
    int GET_SATURATION = 201;
    int SAVE_SATURATION = 202;
    int SET_HUE = 203;
    int GET_HUE = 204;
    int SAVE_HUE = 205;
    int SET_PQMODE = 206;
    int GET_PQMODE = 207;
    int SAVE_PQMODE = 208;
    int SET_SHARPNESS = 209;
    int GET_SHARPNESS = 210;
    int SAVE_SHARPNESS = 211;
    int SET_BACKLIGHT = 212;
    int GET_BACKLIGHT = 213;
    int SAVE_BACKLIGHT = 214;
    int SET_COLOR_MODE = 215;
    int GET_COLOR_MODE = 216;
    int SAVE_COLOR_MODE = 217;
    int SET_COLOR_TEMPERATURE = 218;
    int GET_COLOR_TEMPERATURE = 219;
    int SAVE_COLOR_TEMPERATURE = 220;
    int SET_DISPLAY_MODE = 221;
    int GET_DISPLAY_MODE = 222;
    int SAVE_DISPLAY_MODE = 223;
    int SET_NOISE_REDUCTION_MODE = 224;
    int GET_NOISE_REDUCTION_MODE = 225;
    int SET_BACKLIGHT_SWITCH = 227;
    int GET_BACKLIGHT_SWITCH = 228;
    int SET_EYE_PROTETION_MODE = 230;
    int GET_EYE_PROTETION_MODE = 231;
    int SET_GAMMA = 232;
    int GETRGBOGO_POSTOFFSET = 233;
    int GETRGBOGO_GAIN = 236;

    // FACTORY
    int FACTORY_SETPQMODE_BRIGHTNESS = 240;
    int FACTORY_GETPQMODE_BRIGHTNESS = 241;
    int FACTORY_SETPQMODE_CONTRAST = 242;
    int FACTORY_GETPQMODE_CONTRAST = 243;
    int FACTORY_SETPQMODE_SATURATION = 244;
    int FACTORY_GETPQMODE_SATURATION = 245;
    int FACTORY_SETPQMODE_HUE = 246;
    int FACTORY_GETPQMODE_HUE = 247;
    int FACTORY_SETPQMODE_SHARPNESS = 248;
    int FACTORY_GETPQMODE_SHARPNESS = 249;

    int FACTORY_SETTESTPATTERN = 268;
    int FACTORY_GETTESTPATTERN = 269;
    int FACTORY_RESETPQMODE = 270;
    int FACTORY_RESETCOLORTEMP = 271;
    int FACTORY_RESETPAMAMSDEFAULT = 272;
    int FACTORY_SETDDRSSC = 273;
    int FACTORY_GETDDRSSC = 274;
    int FACTORY_SETLVDSSSC = 275;
    int FACTORY_GETLVDSSSC = 276;
    int FACTORY_SETNOLINEPARAMS = 277;
    int FACTORY_GETNOLINEPARAMS = 278;
    int FACTORY_SETOVERSCAN = 279;
    int FACTORY_GETOVERSCAN = 280;
    int FACTORY_SET_OUT_DEFAULT = 281;
    int FACTORY_CLEAN_ALL_TABLE_FOR_PROGRAM = 294;
    int FACTORY_SETPATTERN_YUV = 297;
    int FACTORY_SET_GAMMA_PATTERN = 298;
    int FACTORY_SET_RGB_PATTERN = 299;
    int FACTORY_GET_RGB_PATTERN = 300;
    // FACTORY END

    // AUDIO
    // AUDIO MUTE
    int SET_AUDIO_MUTEKEY_STATUS = 301;
    int GET_AUDIO_MUTEKEY_STATUS = 302;
    //int SET_AUDIO_FORCE_MUTE_STATUS = 303;
    //int GET_AUDIO_FORCE_MUTE_STATUS = 304;
    int SET_AUDIO_AVOUT_MUTE_STATUS = 305;
    int GET_AUDIO_AVOUT_MUTE_STATUS = 306;
    int SET_AUDIO_SPDIF_MUTE_STATUS = 307;
    int GET_AUDIO_SPDIF_MUTE_STATUS = 308;
    // AUDIO MASTER VOLUME
    int SET_AUDIO_MASTER_VOLUME = 309;
    int GET_AUDIO_MASTER_VOLUME = 310;
    int SAVE_CUR_AUDIO_MASTER_VOLUME = 311;
    int GET_CUR_AUDIO_MASTER_VOLUME = 312;
    // AUDIO BALANCE
    int SET_AUDIO_BALANCE = 313;
    int GET_AUDIO_BALANCE = 314;
    int SAVE_CUR_AUDIO_BALANCE = 315;
    int GET_CUR_AUDIO_BALANCE = 316;
    // AUDIO SUPPERBASS VOLUME
    int SET_AUDIO_SUPPER_BASS_VOLUME = 317;
    int GET_AUDIO_SUPPER_BASS_VOLUME = 318;
    int SAVE_CUR_AUDIO_SUPPER_BASS_VOLUME = 319;
    int GET_CUR_AUDIO_SUPPER_BASS_VOLUME = 320;
    // AUDIO SUPPERBASS SWITCH
    int SET_AUDIO_SUPPER_BASS_SWITCH = 321;
    int GET_AUDIO_SUPPER_BASS_SWITCH = 322;
    int SAVE_CUR_AUDIO_SUPPER_BASS_SWITCH = 323;
    int GET_CUR_AUDIO_SUPPER_BASS_SWITCH = 324;
    // AUDIO SRS SURROUND SWITCH
    int SET_AUDIO_SRS_SURROUND = 325;
    int GET_AUDIO_SRS_SURROUND = 326;
    int SAVE_CUR_AUDIO_SRS_SURROUND = 327;
    int GET_CUR_AUDIO_SRS_SURROUND = 328;
    // AUDIO SRS DIALOG CLARITY
    int SET_AUDIO_SRS_DIALOG_CLARITY = 329;
    int GET_AUDIO_SRS_DIALOG_CLARITY = 330;
    int SAVE_CUR_AUDIO_SRS_DIALOG_CLARITY = 331;
    int GET_CUR_AUDIO_SRS_DIALOG_CLARITY = 332;
    // AUDIO SRS TRUBASS
    int SET_AUDIO_SRS_TRU_BASS = 333;
    int GET_AUDIO_SRS_TRU_BASS = 334;
    int SAVE_CUR_AUDIO_SRS_TRU_BASS = 335;
    int GET_CUR_AUDIO_SRS_TRU_BASS = 336;
    // AUDIO BASS
    int SET_AUDIO_BASS_VOLUME = 337;
    int GET_AUDIO_BASS_VOLUME = 338;
    int SAVE_CUR_AUDIO_BASS_VOLUME = 339;
    int GET_CUR_AUDIO_BASS_VOLUME = 340;
    // AUDIO TREBLE
    int SET_AUDIO_TREBLE_VOLUME = 341;
    int GET_AUDIO_TREBLE_VOLUME = 342;
    int SAVE_CUR_AUDIO_TREBLE_VOLUME = 343;
    int GET_CUR_AUDIO_TREBLE_VOLUME = 344;
    // AUDIO SOUND MODE
    int SET_AUDIO_SOUND_MODE = 345;
    int GET_AUDIO_SOUND_MODE = 346;
    int SAVE_CUR_AUDIO_SOUND_MODE = 347;
    int GET_CUR_AUDIO_SOUND_MODE = 348;
    // AUDIO WALL EFFECT
    int SET_AUDIO_WALL_EFFECT = 349;
    int GET_AUDIO_WALL_EFFECT = 350;
    int SAVE_CUR_AUDIO_WALL_EFFECT = 351;
    int GET_CUR_AUDIO_WALL_EFFECT = 352;
    // AUDIO EQ MODE
    int SET_AUDIO_EQ_MODE = 353;
    int GET_AUDIO_EQ_MODE = 354;
    int SAVE_CUR_AUDIO_EQ_MODE = 355;
    int GET_CUR_AUDIO_EQ_MODE = 356;
    // AUDIO EQ GAIN
    int GET_AUDIO_EQ_RANGE = 357;
    int GET_AUDIO_EQ_BAND_COUNT = 358;
    int SET_AUDIO_EQ_GAIN = 359;
    int GET_AUDIO_EQ_GAIN = 360;
    int GET_CUR_EQ_GAIN = 361;
    int SAVE_CUR_AUDIO_EQ_GAIN = 362;
    int SET_AUDIO_EQ_SWITCH = 363;
    // AUDIO SPDIF SWITCH
    int SET_AUDIO_SPDIF_SWITCH = 364;
    //int GET_AUDIO_SPDIF_SWITCH = 365;
    int SAVE_CUR_AUDIO_SPDIF_SWITCH = 366;
    int GET_CUR_AUDIO_SPDIF_SWITCH = 367;
    // AUDIO SPDIF MODE
    int SET_AUDIO_SPDIF_MODE = 368;
    //int GET_AUDIO_SPDIF_MODE = 369;
    int SAVE_CUR_AUDIO_SPDIF_MODE = 370;
    int GET_CUR_AUDIO_SPDIF_MODE = 371;
    // amAudio
    //int OPEN_AMAUDIO = 372;
    //int CLOSE_AMAUDIO = 373;
    //int SET_AMAUDIO_INPUT_SR = 374;
    int SET_AMAUDIO_OUTPUT_MODE = 375;
    int SET_AMAUDIO_MUSIC_GAIN = 376;
    int SET_AMAUDIO_LEFT_GAIN = 377;
    int SET_AMAUDIO_RIGHT_GAIN = 378;
    int SET_AMAUDIO_PRE_GAIN = 379;
    int SET_AMAUDIO_PRE_MUTE = 380;
    int GET_AMAUDIO_PRE_MUTE = 381;
    int SET_AMAUDIO_REV4 = 382;
    int SET_AMAUDIO_REV5 = 383;
    //AUDIO INPUT LEVEL SWITCH
    int SELECT_LINE_IN_CHANNEL = 384;
    int SET_LINE_IN_CAPTURE_VOL = 385;
    //int HANDLE_AUDIO_HEADSET_PLUG_IN = 386;
    //int HANDLE_AUDIO_HEADSET_PULL_OUT = 387;
    int SET_AUDIO_VOL_COMP = 388;
    int GET_AUDIO_VOL_COMP = 389;
    //int SET_NOISE_GATE_THRESHOLD = 390;
    //int SAVE_AUDIO_VOL_COMP = 391;
    int AUDIO_SET_DOUBLE_OUTPUT_ENABLE =393;
    int USB_AUDIO_OUPUT_MODULE_ENABLE =394;
    int GET_USB_AUDIO_DOUBLE_OUPUT_MODULE_ENABLE =395;
    int GET_USB_AUDIO_OUPUT_MODULE_ENABLE =396;
    int SET_AUDIO_MUTE_FOR_TV = 397;
    int SET_AUDIO_VIRTUAL = 402;
    int GET_AUDIO_VIRTUAL_ENABLE = 403;
    int GET_AUDIO_VIRTUAL_LEVEL = 404;
    //AUDIO END

    // CALLBACK
    int SEARCH_CALLBACK = 501;
    int SIGLE_DETECT_CALLBACK = 502;
    int VGA_CALLBACK = 503;
    int DREAM_PANEL_CALLBACK = 504;
    int ADC_CALIBRATION_CALLBACK = 505;
    int SOURCE_SWITCH_CALLBACK = 506;
    int CHANNEL_SELECT_CALLBACK = 507;
    int STATUS_3D_CALLBACK = 508;
    int DTV_AV_PLAYBACK_CALLBACK = 509;
    int SOURCE_CONNECT_CALLBACK = 510;
    int HDMIRX_CEC_CALLBACK = 511;
    int SERIAL_COMMUNICATION_CALLBACK = 512;
    int CLOSE_CAPTION_CALLBACK = 514;
    int VCHIP_CALLBACK = 515;
    int UPGRADE_FBC_CALLBACK = 516;

    int RELEASE_RESOURCE_CALLBACK = 530;
    int RESOURCES_STATE_CHANGED_CALLBACK = 531;
    int RESOURCE_STATE_CHANGED_LISTEN_NOFIFY_CALLBACK = 532;

    int SUBTITLE_UPDATE_CALLBACK = 540;
    int SCAN_EVENT_CALLBACK = 541;
    int EPG_EVENT_CALLBACK = 542;
    int VFRAME_BMP_EVENT_CALLBACK = 543;
    int SCANNING_FRAME_STABLE_CALLBACK = 544;
    int SCAN_LCN_CALLBACK = 545;
    // CALLBACK END

    // SSM
    int SSM_INIT_DEVICE = 600;
    int SSM_SAVE_ONE_BYTE = 601;
    int SSM_READ_ONE_BYTE = 602;
    int SSM_SAVE_N_BYTES = 603;
    int SSM_READ_N_BYTES = 604;
    int SSM_SAVE_POWER_ON_OFF_CHANNEL = 605;
    int SSM_READ_POWER_ON_OFF_CHANNEL = 606;
    int SSM_SAVE_SOURCE_INPUT = 607;
    int SSM_READ_SOURCE_INPUT = 608;
    int SSM_SAVE_LAST_SOURCE_INPUT = 609;
    int SSM_READ_LAST_SOURCE_INPUT = 610;
    int SSM_SAVE_SYS_LANGUAGE = 611;
    int SSM_READ_SYS_LANGUAGE = 612;
    int SSM_SAVE_AGING_MODE = 613;
    int SSM_READ_AGING_MODE = 614;
    int SSM_SAVE_PANEL_TYPE = 615;
    int SSM_READ_PANEL_TYPE = 616;
    int SSM_SAVE_MAC_ADDR = 617;
    int SSM_READ_MAC_ADDR = 618;
    int SSM_SAVE_BAR_CODE = 619;
    int SSM_READ_BAR_CODE = 620;
    int SSM_SAVE_POWER_ON_MUSIC_SWITCH = 623;
    int SSM_READ_POWER_ON_MUSIC_SWITCH = 624;
    int SSM_SAVE_POWER_ON_MUSIC_VOL = 625;
    int SSM_READ_POWER_ON_MUSIC_VOL = 626;
    int SSM_SAVE_SYS_SLEEP_TIMER = 627;
    int SSM_READ_SYS_SLEEP_TIMER = 628;
    //int SSM_SET_BUS_STATUS = 629;
    //int SSM_GET_BUS_STATUS = 630;
    int SSM_SAVE_INPUT_SRC_PARENTAL_CTL = 631;
    int SSM_READ_INPUT_SRC_PARENTAL_CTL = 632;
    int SSM_SAVE_PARENTAL_CTL_SWITCH = 633;
    int SSM_READ_PARENTAL_CTL_SWITCH = 634;
    int SSM_SAVE_PARENTAL_CTL_PASS_WORD = 635;
    //int SSM_READ_PARENTAL_CTL_PASS_WORD = 636;
    //int SSM_SAVE_USING_DEF_HDCP_KEY_FLAG = 637;
    //int SSM_READ_USING_DEF_HDCP_KEY_FLAG = 638;
    int SSM_GET_CUSTOMER_DATA_START = 639;
    int SSM_GET_CUSTOMER_DATA_LEN = 640;
    int SSM_SAVE_STANDBY_MODE = 641;
    int SSM_READ_STANDBY_MODE = 642;
    int SSM_SAVE_LOGO_ON_OFF_FLAG = 643;
    int SSM_READ_LOGO_ON_OFF_FLAG = 644;
    int SSM_SAVE_HDMIEQ_MODE = 645;
    int SSM_READ_HDMIEQ_MODE = 646;
    int SSM_SAVE_HDMIINTERNAL_MODE = 647;
    int SSM_READ_HDMIINTERNAL_MODE = 648;
    int SSM_SAVE_GLOBAL_OGOENABLE = 651;
    int SSM_READ_GLOBAL_OGOENABLE = 652;
    int SSM_SAVE_LOCAL_DIMING_STATUS = 653;
    int SSM_READ_LOCAL_DIMING_STATUS = 654;
    int SSM_SAVE_NON_STANDARD_STATUS = 655;
    int SSM_READ_NON_STANDARD_STATUS = 656;
    int SSM_SAVE_ADB_SWITCH_STATUS = 657;
    int SSM_READ_ADB_SWITCH_STATUS = 658;
    int SSM_SAVE_SERIAL_CMD_SWITCH_STATUS = 659;
    int SSM_READ_SERIAL_CMD_SWITCH_STATUS = 660;
    int SSM_SET_HDCP_KEY = 661;
    int SSM_SAVE_CHROMA_STATUS = 662;
    int SSM_SAVE_CA_BUFFER_SIZE = 663;
    int SSM_READ_CA_BUFFER_SIZE = 664;
    int SSM_GET_ATV_DATA_START = 665;
    int SSM_GET_ATV_DATA_LEN = 666;
    int SSM_GET_VPP_DATA_START = 667;
    int SSM_GET_VPP_DATA_LEN = 668;
    int SSM_SAVE_NOISE_GATE_THRESHOLD_STATUS = 669;
    int SSM_READ_NOISE_GATE_THRESHOLD_STATUS = 670;
    int SSM_SAVE_TV_TYPE = 671;
    int SSM_READ_TV_TYPE = 672;
    int SSM_SAVE_HDCPKEY = 675;
    int SSM_READ_HDCPKEY = 676;
    int SSM_READ_BLACKOUT_ENABLE = 677;
    int SSM_REFRESH_HDCPKEY = 678;
    int SSM_SAVE_HDMI_EDID_VER = 679;
    int SSM_READ_HDMI_EDID_VER = 680;
    int SSM_SAVE_HDCP_KEY_ENABLE = 681;
    int SSM_READ_HDCP_KEY_ENABLE = 682;

    // Misc
    int MISC_CFG_SET = 703;
    int MISC_CFG_GET = 704;
    int MISC_SET_GPIO_CTL = 705;
    int MISC_GET_GPIO_CTL = 706;
    int MISC_SET_WDT_USER_PET = 708;
    int MISC_SET_WDT_USER_COUNTER = 709;
    int MISC_SET_WDT_USER_PET_RESET_ENABLE = 710;
    int MISC_GET_TV_API_VERSION = 713;
    int MISC_GET_DVB_API_VERSION = 714;
    int MISC_SERIAL_SWITCH = 715;
    int MISC_SERIAL_SEND_DATA = 716;

    //Extra
    int HDMIRX_GET_KSV_INFO = 810;
    int HANDLE_GPIO = 816;
    int SET_LCD_ENABLE = 817;

    //Fac_FBC
    int FACTORY_FBC_UPGRADE = 900;
    int FACTORY_FBC_SET_BRIGHTNESS = 901;
    int FACTORY_FBC_GET_BRIGHTNESS = 902;
    int FACTORY_FBC_SET_CONTRAST = 903;
    int FACTORY_FBC_GET_CONTRAST = 904;
    int FACTORY_FBC_SET_SATURATION = 905;
    int FACTORY_FBC_GET_SATURATION = 906;
    int FACTORY_FBC_SET_HUE = 907;
    int FACTORY_FBC_GET_HUE = 908;
    int FACTORY_FBC_SET_BACKLIGHT = 909;
    int FACTORY_FBC_GET_BACKLIGHT = 910;
    int FACTORY_FBC_SET_PIC_MODE = 911;
    int FACTORY_FBC_GET_PIC_MODE = 912;
    int FACTORY_FBC_SET_GAIN_RED = 913;
    int FACTORY_FBC_GET_GAIN_RED = 914;
    int FACTORY_FBC_SET_GAIN_GREEN = 915;
    int FACTORY_FBC_GET_GAIN_GREEN = 916;
    int FACTORY_FBC_SET_GAIN_BLUE = 917;
    int FACTORY_FBC_GET_GAIN_BLUE = 918;
    int FACTORY_FBC_SET_OFFSET_RED = 919;
    int FACTORY_FBC_GET_OFFSET_RED = 920;
    int FACTORY_FBC_SET_OFFSET_GREEN = 921;
    int FACTORY_FBC_GET_OFFSET_GREEN = 922;
    int FACTORY_FBC_SET_OFFSET_BLUE = 923;
    int FACTORY_FBC_GET_OFFSET_BLUE = 924;
    int FACTORY_FBC_SET_COLORTEMP_MODE = 925;
    int FACTORY_FBC_GET_COLORTEMP_MODE = 926;
    int FACTORY_FBC_SET_WB_INIT = 927;
    int FACTORY_FBC_GET_WB_INIT = 928;
    int FACTORY_FBC_SET_TEST_PATTERN = 929;
    int FACTORY_FBC_GET_TEST_PATTERN = 930;
    int FACTORY_FBC_SET_BACKLIGHT_EN =931;
    int FACTORY_FBC_GET_BACKLIGHT_EN =932;
    int FACTORY_FBC_SET_LVDS_SSG =933;
    int FACTORY_FBC_SET_ELEC_MODE =934;
    int FACTORY_FBC_GET_MAINCODE_VERSION = 935;
    int FACTORY_FBC_PANEL_POWER_SWITCH = 936;
    int FACTORY_FBC_PANEL_GET_INFO = 937;
    int FACTORY_FBC_PANEL_SUSPEND = 938;
    //int FACTORY_FBC_POWER_REBOOT = 940;
    int FACTORY_FBC_GET_ELEC_MODE = 941;
    int FACTORY_FBC_PANEL_USER_SETTING_DEFAULT = 942;
    int FACTORY_SET_SN = 1014;
    int FACTORY_GET_SN = 1015;

    //uniform whitebalance
    int FACTORY_WHITE_BALANCE_SET_GAIN_RED = 1100;
    int FACTORY_WHITE_BALANCE_GET_GAIN_RED = 1101;
    int FACTORY_WHITE_BALANCE_SET_GAIN_GREEN = 1102;
    int FACTORY_WHITE_BALANCE_GET_GAIN_GREEN = 1103;
    int FACTORY_WHITE_BALANCE_SET_GAIN_BLUE = 1104;
    int FACTORY_WHITE_BALANCE_GET_GAIN_BLUE = 1105;
    int FACTORY_WHITE_BALANCE_SET_OFFSET_RED = 1106;
    int FACTORY_WHITE_BALANCE_GET_OFFSET_RED = 1107;
    int FACTORY_WHITE_BALANCE_SET_OFFSET_GREEN = 1108;
    int FACTORY_WHITE_BALANCE_GET_OFFSET_GREEN = 1109;
    int FACTORY_WHITE_BALANCE_SET_OFFSET_BLUE = 1110;
    int FACTORY_WHITE_BALANCE_GET_OFFSET_BLUE = 1111;
    int FACTORY_WHITE_BALANCE_GET_COLOR_TMP = 1112;
    int FACTORY_WHITE_BALANCE_SET_COLOR_TMP = 1113;
    int FACTORY_WHITE_BALANCE_SAVE_PRAMAS = 1114;
    int FACTORY_WHITE_BALANCE_SET_WB_INIT = 1115;
    int FACTORY_WHITE_BALANCE_GET_WB_INIT = 1116;
    int FACTORY_WHITE_BALANCE_SET_GRAY_PATTERN = 1117;
    int FACTORY_WHITE_BALANCE_GET_GRAY_PATTERN = 1118;
    int FACTORY_WHITE_BALANCE_OPEN_GRAY_PATTERN = 1119;
    int FACTORY_WHITE_BALANCE_CLOSE_GRAY_PATTERN = 1120;
    int FACTORY_WHITE_BALANCE_GET_ALL_PRAMAS = 1121;

    //ATV/DTV
    int TV_SCAN_2 = 1374;
    int PLAY_PROGRAM_2 = 1375;
    int ATV_DTV_GET_SCAN_STATUS = 1376;
    int DTV_SET_TEXT_CODING = 1377;
    int ATV_DTV_SCAN_PAUSE = 1378;
    int ATV_DTV_SCAN_RESUME = 1379;
    int ATV_GET_VIDEO_CENTER_FREQ = 1388;
    int ATV_GET_CURRENT_PROGRAM_ID = 1389;
    int DTV_GET_CURRENT_PROGRAM_ID = 1390;
    int ATV_SAVE_PROGRAM_ID = 1391;
    int DTV_SCAN_MANUAL_BETWEEN_FREQ = 1392;
    int ATV_GET_MIN_MAX_FREQ = 1393;
    int DTV_GET_SCAN_FREQUENCY_LIST = 1394;
    int DTV_GET_CHANNEL_INFO = 1395;
    int ATV_GET_CHANNEL_INFO = 1396;
    int ATV_SCAN_MANUAL = 1397;
    int ATV_SCAN_MANUAL_BY_NUMBER = 1387;
    int ATV_SCAN_AUTO = 1398;
    int DTV_SCAN_MANUAL = 1399;
    int DTV_SCAN_AUTO = 1400;
    //int TV_SUBTITLE_DRAW_END = 1401;
    int PLAY_PROGRAM = 1402;
    int STOP_PROGRAM_PLAY = 1403;
    int GET_PROGRAM_LIST = 1404;
    int DTV_STOP_SCAN = 1405;
    int DTV_GET_SNR = 1406;
    int DTV_GET_BER = 1407;
    int DTV_GET_STRENGTH = 1408;
    int DTV_GET_AUDIO_TRACK_NUM = 1409;
    int DTV_GET_AUDIO_TRACK_INFO = 1410;
    int DTV_SWITCH_AUDIO_TRACK = 1411;
    int DTV_GET_EPG_UTC_TIME = 1412;
    int DTV_GET_CUR_FREQ = 1413;
    int DTV_GET_EPG_INFO_POINT_IN_TIME = 1414;
    int DTV_GET_EPG_INFO_DURATION = 1415;
    int SET_FRONTEND_PARA = 1416;
    int DTV_SET_PROGRAM_NAME = 1417;
    int DTV_SET_PROGRAM_SKIPPED = 1418;
    int DTV_SET_PROGRAM_FAVORITE = 1419;
    int DTV_DETELE_PROGRAM  = 1420;
    int DTV_SWAP_PROGRAM = 1421;
    int DTV_SET_PROGRAM_LOCKED = 1422;
    int DTV_GET_BOOKED_EVENT = 1424;
    int DTV_GET_CURR_AUDIO_TRACK_INDEX = 1425;
    int DTV_SET_AUDIO_CHANNEL_MOD = 1426;
    int DTV_GET_AUDIO_CHANNEL_MOD = 1427;
    int DTV_GET_FREQ_BY_PROG_ID = 1428;
    int DTV_GET_VIDEO_FMT_INFO = 1429;
    int DTV_START_CC = 1430;
    int DTV_STOP_CC = 1431;
    int DTV_SET_AUDIO_AD = 1442;
    int DTV_GET_AUDIO_FMT_INFO = 1443;

    int TV_CLEAR_ALL_PROGRAM  = 1454;
    int SET_BLACKOUT_ENABLE = 1455;
    int START_AUTO_BACKLIGHT = 1456;
    int STOP_AUTO_BACKLIGHT = 1457;
    int IS_AUTO_BACKLIGHTING = 1458;

    int GET_AVERAGE_LUMA = 1480;
    int GET_AUTO_BACKLIGHT_DATA = 1481;
    int SET_AUTO_BACKLIGHT_DATA = 1482;
    int DTV_SCAN = 1483;
    int DTV_GET_SCAN_FREQUENCY_LIST_MODE = 1484;
    int TV_CLEAR_FRONTEND = 1485;
}
