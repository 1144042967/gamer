package cn.sd.jrz.util;

import com.develop.jawin.*;

@SuppressWarnings("unused")
public class DmSoft extends DispatchPtr {
    private static final GUID PROXY_IID = new GUID("{F3F54BC2-D6D1-4A85-B943-16287ECEA64C}");
    private static final int IID_TOKEN;

    static {
        IID_TOKEN = IdentityManager.registerProxy(PROXY_IID, DmSoft.class);
    }

    public int getGuidToken() {
        return IID_TOKEN;
    }

    public DmSoft(String programId) throws COMException {
        super(programId);
    }

    public DmSoft(IUnknown other) throws COMException {
        super(other);
    }

    public DmSoft(GUID ClsID) throws COMException {
        super(ClsID);
    }

    public String Ver() throws COMException {
        return (String) invoke("Ver");
    }

    public int SetPath(String path) throws COMException {
        return (Integer) invokeN("SetPath", new Object[]{path}, 1);
    }

    public String Ocr(int x1, int y1, int x2, int y2, String color, double sim) throws COMException {
        return (String) invokeN("Ocr", new Object[]{x1, y1, x2, y2, color, sim}, 6);
    }

    public int FindStr(int x1, int y1, int x2, int y2, String str, String color, double sim, Object x, Object y) throws COMException {
        return (Integer) invokeN("FindStr", new Object[]{x1, y1, x2, y2, str, color, sim, x, y}, 9);
    }

    public int GetResultCount(String str) throws COMException {
        return (Integer) invokeN("GetResultCount", new Object[]{str}, 1);
    }

    public int GetResultPos(String str, int index, Object x, Object y) throws COMException {
        return (Integer) invokeN("GetResultPos", new Object[]{str, index, x, y}, 4);
    }

    public int StrStr(String s, String str) throws COMException {
        return (Integer) invokeN("StrStr", new Object[]{s, str}, 2);
    }

    public int SendCommand(String cmd) throws COMException {
        return (Integer) invokeN("SendCommand", new Object[]{cmd}, 1);
    }

    public int UseDict(int index) throws COMException {
        return (Integer) invokeN("UseDict", new Object[]{index}, 1);
    }

    public String GetBasePath() throws COMException {
        return (String) invoke("GetBasePath");
    }

    public int SetDictPwd(String pwd) throws COMException {
        return (Integer) invokeN("SetDictPwd", new Object[]{pwd}, 1);
    }

    public String OcrInFile(int x1, int y1, int x2, int y2, String picName, String color, double sim) throws COMException {
        return (String) invokeN("OcrInFile", new Object[]{x1, y1, x2, y2, picName, color, sim}, 7);
    }

    public int Capture(int x1, int y1, int x2, int y2, String file) throws COMException {
        return (Integer) invokeN("Capture", new Object[]{x1, y1, x2, y2, file}, 5);
    }

    public int KeyPress(int vk) throws COMException {
        return (Integer) invokeN("KeyPress", new Object[]{vk}, 1);
    }

    public int KeyDown(int vk) throws COMException {
        return (Integer) invokeN("KeyDown", new Object[]{vk}, 1);
    }

    public int KeyUp(int vk) throws COMException {
        return (Integer) invokeN("KeyUp", new Object[]{vk}, 1);
    }

    public int LeftClick() throws COMException {
        return (Integer) invoke("LeftClick");
    }

    public int RightClick() throws COMException {
        return (Integer) invoke("RightClick");
    }

    public int MiddleClick() throws COMException {
        return (Integer) invoke("MiddleClick");
    }

    public int LeftDoubleClick() throws COMException {
        return (Integer) invoke("LeftDoubleClick");
    }

    public int LeftDown() throws COMException {
        return (Integer) invoke("LeftDown");
    }

    public int LeftUp() throws COMException {
        return (Integer) invoke("LeftUp");
    }

    public int RightDown() throws COMException {
        return (Integer) invoke("RightDown");
    }

    public int RightUp() throws COMException {
        return (Integer) invoke("RightUp");
    }

    public int MoveTo(int x, int y) throws COMException {
        return (Integer) invokeN("MoveTo", new Object[]{x, y}, 2);
    }

    public int MoveR(int rx, int ry) throws COMException {
        return (Integer) invokeN("MoveR", new Object[]{rx, ry}, 2);
    }

    public String GetColor(int x, int y) throws COMException {
        return (String) invokeN("GetColor", new Object[]{x, y}, 2);
    }

    public String GetColorBGR(int x, int y) throws COMException {
        return (String) invokeN("GetColorBGR", new Object[]{x, y}, 2);
    }

    public String RGB2BGR(String rgbColor) throws COMException {
        return (String) invokeN("RGB2BGR", new Object[]{rgbColor}, 1);
    }

    public String BGR2RGB(String bgrColor) throws COMException {
        return (String) invokeN("BGR2RGB", new Object[]{bgrColor}, 1);
    }

    public int UnBindWindow() throws COMException {
        return (Integer) invoke("UnBindWindow");
    }

    public int CmpColor(int x, int y, String color, double sim) throws COMException {
        return (Integer) invokeN("CmpColor", new Object[]{x, y, color, sim}, 4);
    }

    public int ClientToScreen(int hWnd, Object x, Object y) throws COMException {
        return (Integer) invokeN("ClientToScreen", new Object[]{hWnd, x, y}, 3);
    }

    public int ScreenToClient(int hWnd, Object x, Object y) throws COMException {
        return (Integer) invokeN("ScreenToClient", new Object[]{hWnd, x, y}, 3);
    }

    public int ShowScrMsg(int x1, int y1, int x2, int y2, String msg, String color) throws COMException {
        return (Integer) invokeN("ShowScrMsg", new Object[]{x1, y1, x2, y2, msg, color}, 6);
    }

    public int SetMinRowGap(int rowGap) throws COMException {
        return (Integer) invokeN("SetMinRowGap", new Object[]{rowGap}, 1);
    }

    public int SetMinColGap(int colGap) throws COMException {
        return (Integer) invokeN("SetMinColGap", new Object[]{colGap}, 1);
    }

    public int FindColor(int x1, int y1, int x2, int y2, String color, double sim, int dir, Object x, Object y) throws COMException {
        return (Integer) invokeN("FindColor", new Object[]{x1, y1, x2, y2, color, sim, dir, x, y}, 9);
    }

    public String FindColorEx(int x1, int y1, int x2, int y2, String color, double sim, int dir) throws COMException {
        return (String) invokeN("FindColorEx", new Object[]{x1, y1, x2, y2, color, sim, dir}, 7);
    }

    public int SetWordLineHeight(int lineHeight) throws COMException {
        return (Integer) invokeN("SetWordLineHeight", new Object[]{lineHeight}, 1);
    }

    public int SetWordGap(int wordGap) throws COMException {
        return (Integer) invokeN("SetWordGap", new Object[]{wordGap}, 1);
    }

    public int SetRowGapNoDict(int rowGap) throws COMException {
        return (Integer) invokeN("SetRowGapNoDict", new Object[]{rowGap}, 1);
    }

    public int SetColGapNoDict(int colGap) throws COMException {
        return (Integer) invokeN("SetColGapNoDict", new Object[]{colGap}, 1);
    }

    public int SetWordLineHeightNoDict(int lineHeight) throws COMException {
        return (Integer) invokeN("SetWordLineHeightNoDict", new Object[]{lineHeight}, 1);
    }

    public int SetWordGapNoDict(int wordGap) throws COMException {
        return (Integer) invokeN("SetWordGapNoDict", new Object[]{wordGap}, 1);
    }

    public int GetWordResultCount(String str) throws COMException {
        return (Integer) invokeN("GetWordResultCount", new Object[]{str}, 1);
    }

    public int GetWordResultPos(String str, int index, Object x, Object y) throws COMException {
        return (Integer) invokeN("GetWordResultPos", new Object[]{str, index, x, y}, 4);
    }

    public String GetWordResultStr(String str, int index) throws COMException {
        return (String) invokeN("GetWordResultStr", new Object[]{str, index}, 2);
    }

    public String GetWords(int x1, int y1, int x2, int y2, String color, double sim) throws COMException {
        return (String) invokeN("GetWords", new Object[]{x1, y1, x2, y2, color, sim}, 6);
    }

    public String GetWordsNoDict(int x1, int y1, int x2, int y2, String color) throws COMException {
        return (String) invokeN("GetWordsNoDict", new Object[]{x1, y1, x2, y2, color}, 5);
    }

    public int SetShowErrorMsg(int show) throws COMException {
        return (Integer) invokeN("SetShowErrorMsg", new Object[]{show}, 1);
    }

    public int GetClientSize(int hWnd, Object width, Object height) throws COMException {
        return (Integer) invokeN("GetClientSize", new Object[]{hWnd, width, height}, 3);
    }

    public int MoveWindow(int hWnd, int x, int y) throws COMException {
        return (Integer) invokeN("MoveWindow", new Object[]{hWnd, x, y}, 3);
    }

    public String GetColorHSV(int x, int y) throws COMException {
        return (String) invokeN("GetColorHSV", new Object[]{x, y}, 2);
    }

    public String GetAveRGB(int x1, int y1, int x2, int y2) throws COMException {
        return (String) invokeN("GetAveRGB", new Object[]{x1, y1, x2, y2}, 4);
    }

    public String GetAveHSV(int x1, int y1, int x2, int y2) throws COMException {
        return (String) invokeN("GetAveHSV", new Object[]{x1, y1, x2, y2}, 4);
    }

    public int GetForegroundWindow() throws COMException {
        return (Integer) invoke("GetForegroundWindow");
    }

    public int GetForegroundFocus() throws COMException {
        return (Integer) invoke("GetForegroundFocus");
    }

    public int GetMousePointWindow() throws COMException {
        return (Integer) invoke("GetMousePointWindow");
    }

    public int GetPointWindow(int x, int y) throws COMException {
        return (Integer) invokeN("GetPointWindow", new Object[]{x, y}, 2);
    }

    public String EnumWindow(int parent, String title, String className, int filter) throws COMException {
        return (String) invokeN("EnumWindow", new Object[]{parent, title, className, filter}, 4);
    }

    public int GetWindowState(int hWnd, int flag) throws COMException {
        return (Integer) invokeN("GetWindowState", new Object[]{hWnd, flag}, 2);
    }

    public int GetWindow(int hWnd, int flag) throws COMException {
        return (Integer) invokeN("GetWindow", new Object[]{hWnd, flag}, 2);
    }

    public int GetSpecialWindow(int flag) throws COMException {
        return (Integer) invokeN("GetSpecialWindow", new Object[]{flag}, 1);
    }

    public int SetWindowText(int hWnd, String text) throws COMException {
        return (Integer) invokeN("SetWindowText", new Object[]{hWnd, text}, 2);
    }

    public int SetWindowSize(int hWnd, int width, int height) throws COMException {
        return (Integer) invokeN("SetWindowSize", new Object[]{hWnd, width, height}, 3);
    }

    public int GetWindowRect(int hWnd, Object x1, Object y1, Object x2, Object y2) throws COMException {
        return (Integer) invokeN("GetWindowRect", new Object[]{hWnd, x1, y1, x2, y2}, 5);
    }

    public String GetWindowTitle(int hWnd) throws COMException {
        return (String) invokeN("GetWindowTitle", new Object[]{hWnd}, 1);
    }

    public String GetWindowClass(int hWnd) throws COMException {
        return (String) invokeN("GetWindowClass", new Object[]{hWnd}, 1);
    }

    public int SetWindowState(int hWnd, int flag) throws COMException {
        return (Integer) invokeN("SetWindowState", new Object[]{hWnd, flag}, 2);
    }

    public int CreateFoobarRect(int hWnd, int x, int y, int w, int h) throws COMException {
        return (Integer) invokeN("CreateFoobarRect", new Object[]{hWnd, x, y, w, h}, 5);
    }

    public int CreateFoobarRoundRect(int hWnd, int x, int y, int w, int h, int rw, int rh) throws COMException {
        return (Integer) invokeN("CreateFoobarRoundRect", new Object[]{hWnd, x, y, w, h, rw, rh}, 7);
    }

    public int CreateFoobarEllipse(int hWnd, int x, int y, int w, int h) throws COMException {
        return (Integer) invokeN("CreateFoobarEllipse", new Object[]{hWnd, x, y, w, h}, 5);
    }

    public int CreateFoobarCustom(int hWnd, int x, int y, String pic, String transColor, double sim) throws COMException {
        return (Integer) invokeN("CreateFoobarCustom", new Object[]{hWnd, x, y, pic, transColor, sim}, 6);
    }

    public int FoobarFillRect(int hWnd, int x1, int y1, int x2, int y2, String color) throws COMException {
        return (Integer) invokeN("FoobarFillRect", new Object[]{hWnd, x1, y1, x2, y2, color}, 6);
    }

    public int FoobarDrawText(int hWnd, int x, int y, int w, int h, String text, String color, int align) throws COMException {
        return (Integer) invokeN("FoobarDrawText", new Object[]{hWnd, x, y, w, h, text, color, align}, 8);
    }

    public int FoobarDrawPic(int hWnd, int x, int y, String pic, String transColor) throws COMException {
        return (Integer) invokeN("FoobarDrawPic", new Object[]{hWnd, x, y, pic, transColor}, 5);
    }

    public int FoobarUpdate(int hWnd) throws COMException {
        return (Integer) invokeN("FoobarUpdate", new Object[]{hWnd}, 1);
    }

    public int FoobarLock(int hWnd) throws COMException {
        return (Integer) invokeN("FoobarLock", new Object[]{hWnd}, 1);
    }

    public int FoobarUnlock(int hWnd) throws COMException {
        return (Integer) invokeN("FoobarUnlock", new Object[]{hWnd}, 1);
    }

    public int FoobarSetFont(int hWnd, String fontName, int size, int flag) throws COMException {
        return (Integer) invokeN("FoobarSetFont", new Object[]{hWnd, fontName, size, flag}, 4);
    }

    public int FoobarTextRect(int hWnd, int x, int y, int w, int h) throws COMException {
        return (Integer) invokeN("FoobarTextRect", new Object[]{hWnd, x, y, w, h}, 5);
    }

    public int FoobarPrintText(int hWnd, String text, String color) throws COMException {
        return (Integer) invokeN("FoobarPrintText", new Object[]{hWnd, text, color}, 3);
    }

    public int FoobarClearText(int hWnd) throws COMException {
        return (Integer) invokeN("FoobarClearText", new Object[]{hWnd}, 1);
    }

    public int FoobarTextLineGap(int hWnd, int gap) throws COMException {
        return (Integer) invokeN("FoobarTextLineGap", new Object[]{hWnd, gap}, 2);
    }

    public int Play(String file) throws COMException {
        return (Integer) invokeN("Play", new Object[]{file}, 1);
    }

    public int FaqCapture(int x1, int y1, int x2, int y2, int quality, int delay, int time) throws COMException {
        return (Integer) invokeN("FaqCapture", new Object[]{x1, y1, x2, y2, quality, delay, time}, 7);
    }

    public int FaqRelease(int handle) throws COMException {
        return (Integer) invokeN("FaqRelease", new Object[]{handle}, 1);
    }

    public String FaqSend(String server, int handle, int requestType, int timeOut) throws COMException {
        return (String) invokeN("FaqSend", new Object[]{server, handle, requestType, timeOut}, 4);
    }

    public int Beep(int fre, int delay) throws COMException {
        return (Integer) invokeN("Beep", new Object[]{fre, delay}, 2);
    }

    public int FoobarClose(int hWnd) throws COMException {
        return (Integer) invokeN("FoobarClose", new Object[]{hWnd}, 1);
    }

    public int MoveDD(int dx, int dy) throws COMException {
        return (Integer) invokeN("MoveDD", new Object[]{dx, dy}, 2);
    }

    public int FaqGetSize(int handle) throws COMException {
        return (Integer) invokeN("FaqGetSize", new Object[]{handle}, 1);
    }

    public int LoadPic(String picName) throws COMException {
        return (Integer) invokeN("LoadPic", new Object[]{picName}, 1);
    }

    public int FreePic(String picName) throws COMException {
        return (Integer) invokeN("FreePic", new Object[]{picName}, 1);
    }

    public int GetScreenData(int x1, int y1, int x2, int y2) throws COMException {
        return (Integer) invokeN("GetScreenData", new Object[]{x1, y1, x2, y2}, 4);
    }

    public int FreeScreenData(int handle) throws COMException {
        return (Integer) invokeN("FreeScreenData", new Object[]{handle}, 1);
    }

    public int WheelUp() throws COMException {
        return (Integer) invoke("WheelUp");
    }

    public int WheelDown() throws COMException {
        return (Integer) invoke("WheelDown");
    }

    public int SetMouseDelay(String type, int delay) throws COMException {
        return (Integer) invokeN("SetMouseDelay", new Object[]{type, delay}, 2);
    }

    public int SetKeypadDelay(String type, int delay) throws COMException {
        return (Integer) invokeN("SetKeypadDelay", new Object[]{type, delay}, 2);
    }

    public String GetEnv(int index, String name) throws COMException {
        return (String) invokeN("GetEnv", new Object[]{index, name}, 2);
    }

    public int SetEnv(int index, String name, String value) throws COMException {
        return (Integer) invokeN("SetEnv", new Object[]{index, name, value}, 3);
    }

    public int SendString(int hWnd, String str) throws COMException {
        return (Integer) invokeN("SendString", new Object[]{hWnd, str}, 2);
    }

    public int DelEnv(int index, String name) throws COMException {
        return (Integer) invokeN("DelEnv", new Object[]{index, name}, 2);
    }

    public String GetPath() throws COMException {
        return (String) invoke("GetPath");
    }

    public int SetDict(int index, String dictName) throws COMException {
        return (Integer) invokeN("SetDict", new Object[]{index, dictName}, 2);
    }

    public int FindPic(int x1, int y1, int x2, int y2, String picName, String deltaColor, double sim, int dir, Object x, Object y) throws COMException {
        return (Integer) invokeN("FindPic", new Object[]{x1, y1, x2, y2, picName, deltaColor, sim, dir, x, y}, 10);
    }

    public String FindPicEx(int x1, int y1, int x2, int y2, String picName, String deltaColor, double sim, int dir) throws COMException {
        return (String) invokeN("FindPicEx", new Object[]{x1, y1, x2, y2, picName, deltaColor, sim, dir}, 8);
    }

    public int SetClientSize(int hWnd, int width, int height) throws COMException {
        return (Integer) invokeN("SetClientSize", new Object[]{hWnd, width, height}, 3);
    }

    public int ReadInt(int hWnd, String addr, int type) throws COMException {
        return (Integer) invokeN("ReadInt", new Object[]{hWnd, addr, type}, 3);
    }

    public float ReadFloat(int hWnd, String addr) throws COMException {
        return (Float) invokeN("ReadFloat", new Object[]{hWnd, addr}, 2);
    }

    public double ReadDouble(int hWnd, String addr) throws COMException {
        return (Double) invokeN("ReadDouble", new Object[]{hWnd, addr}, 2);
    }

    public String FindInt(int hWnd, String addrRange, int intValueMin, int intValueMax, int type) throws COMException {
        return (String) invokeN("FindInt", new Object[]{hWnd, addrRange, intValueMin, intValueMax, type}, 5);
    }

    public String FindFloat(int hWnd, String addrRange, float floatValueMin, float floatValueMax) throws COMException {
        return (String) invokeN("FindFloat", new Object[]{hWnd, addrRange, floatValueMin, floatValueMax}, 4);
    }

    public String FindDouble(int hWnd, String addrRange, double doubleValueMin, double doubleValueMax) throws COMException {
        return (String) invokeN("FindDouble", new Object[]{hWnd, addrRange, doubleValueMin, doubleValueMax}, 4);
    }

    public String FindString(int hWnd, String addrRange, String stringValue, int type) throws COMException {
        return (String) invokeN("FindString", new Object[]{hWnd, addrRange, stringValue, type}, 4);
    }

    public int GetModuleBaseAddr(int hWnd, String moduleName) throws COMException {
        return (Integer) invokeN("GetModuleBaseAddr", new Object[]{hWnd, moduleName}, 2);
    }

    public String MoveToEx(int x, int y, int w, int h) throws COMException {
        return (String) invokeN("MoveToEx", new Object[]{x, y, w, h}, 4);
    }

    public String MatchPicName(String picName) throws COMException {
        return (String) invokeN("MatchPicName", new Object[]{picName}, 1);
    }

    public int AddDict(int index, String dictInfo) throws COMException {
        return (Integer) invokeN("AddDict", new Object[]{index, dictInfo}, 2);
    }

    public int EnterCri() throws COMException {
        return (Integer) invoke("EnterCri");
    }

    public int LeaveCri() throws COMException {
        return (Integer) invoke("LeaveCri");
    }

    public int WriteInt(int hWnd, String addr, int type, int v) throws COMException {
        return (Integer) invokeN("WriteInt", new Object[]{hWnd, addr, type, v}, 4);
    }

    public int WriteFloat(int hWnd, String addr, float v) throws COMException {
        return (Integer) invokeN("WriteFloat", new Object[]{hWnd, addr, v}, 3);
    }

    public int WriteDouble(int hWnd, String addr, double v) throws COMException {
        return (Integer) invokeN("WriteDouble", new Object[]{hWnd, addr, v}, 3);
    }

    public int WriteString(int hWnd, String addr, int type, String v) throws COMException {
        return (Integer) invokeN("WriteString", new Object[]{hWnd, addr, type, v}, 4);
    }

    public int AsmAdd(String asmIns) throws COMException {
        return (Integer) invokeN("AsmAdd", new Object[]{asmIns}, 1);
    }

    public int AsmClear() throws COMException {
        return (Integer) invoke("AsmClear");
    }

    public int AsmCall(int hWnd, int mode) throws COMException {
        return (Integer) invokeN("AsmCall", new Object[]{hWnd, mode}, 2);
    }

    public int FindMultiColor(int x1, int y1, int x2, int y2, String firstColor, String offsetColor, double sim, int dir, Object x, Object y) throws COMException {
        return (Integer) invokeN("FindMultiColor", new Object[]{x1, y1, x2, y2, firstColor, offsetColor, sim, dir, x, y}, 10);
    }

    public String FindMultiColorEx(int x1, int y1, int x2, int y2, String firstColor, String offsetColor, double sim, int dir) throws COMException {
        return (String) invokeN("FindMultiColorEx", new Object[]{x1, y1, x2, y2, firstColor, offsetColor, sim, dir}, 8);
    }

    public String AsmCode(int baseAddr) throws COMException {
        return (String) invokeN("AsmCode", new Object[]{baseAddr}, 1);
    }

    public String Assemble(String asmCode, int baseAddr, int isUpper) throws COMException {
        return (String) invokeN("Assemble", new Object[]{asmCode, baseAddr, isUpper}, 3);
    }

    public int SetWindowTransparent(int hWnd, int v) throws COMException {
        return (Integer) invokeN("SetWindowTransparent", new Object[]{hWnd, v}, 2);
    }

    public String ReadData(int hWnd, String addr, int len) throws COMException {
        return (String) invokeN("ReadData", new Object[]{hWnd, addr, len}, 3);
    }

    public int WriteData(int hWnd, String addr, String data) throws COMException {
        return (Integer) invokeN("WriteData", new Object[]{hWnd, addr, data}, 3);
    }

    public String FindData(int hWnd, String addrRange, String data) throws COMException {
        return (String) invokeN("FindData", new Object[]{hWnd, addrRange, data}, 3);
    }

    public int SetPicPwd(String pwd) throws COMException {
        return (Integer) invokeN("SetPicPwd", new Object[]{pwd}, 1);
    }

    public int Log(String info) throws COMException {
        return (Integer) invokeN("Log", new Object[]{info}, 1);
    }

    public String FindStrE(int x1, int y1, int x2, int y2, String str, String color, double sim) throws COMException {
        return (String) invokeN("FindStrE", new Object[]{x1, y1, x2, y2, str, color, sim}, 7);
    }

    public String FindColorE(int x1, int y1, int x2, int y2, String color, double sim, int dir) throws COMException {
        return (String) invokeN("FindColorE", new Object[]{x1, y1, x2, y2, color, sim, dir}, 7);
    }

    public String FindPicE(int x1, int y1, int x2, int y2, String picName, String deltaColor, double sim, int dir) throws COMException {
        return (String) invokeN("FindPicE", new Object[]{x1, y1, x2, y2, picName, deltaColor, sim, dir}, 8);
    }

    public String FindMultiColorE(int x1, int y1, int x2, int y2, String firstColor, String offsetColor, double sim, int dir) throws COMException {
        return (String) invokeN("FindMultiColorE", new Object[]{x1, y1, x2, y2, firstColor, offsetColor, sim, dir}, 8);
    }

    public int SetExactOcr(int exactOcr) throws COMException {
        return (Integer) invokeN("SetExactOcr", new Object[]{exactOcr}, 1);
    }

    public String ReadString(int hWnd, String addr, int type, int len) throws COMException {
        return (String) invokeN("ReadString", new Object[]{hWnd, addr, type, len}, 4);
    }

    public int FoobarTextPrintDir(int hWnd, int dir) throws COMException {
        return (Integer) invokeN("FoobarTextPrintDir", new Object[]{hWnd, dir}, 2);
    }

    public String OcrEx(int x1, int y1, int x2, int y2, String color, double sim) throws COMException {
        return (String) invokeN("OcrEx", new Object[]{x1, y1, x2, y2, color, sim}, 6);
    }

    public int SetDisplayInput(String mode) throws COMException {
        return (Integer) invokeN("SetDisplayInput", new Object[]{mode}, 1);
    }

    public int GetTime() throws COMException {
        return (Integer) invoke("GetTime");
    }

    public int GetScreenWidth() throws COMException {
        return (Integer) invoke("GetScreenWidth");
    }

    public int GetScreenHeight() throws COMException {
        return (Integer) invoke("GetScreenHeight");
    }

    public int BindWindowEx(int hWnd, String display, String mouse, String keypad, String publicDesc, int mode) throws COMException {
        return (Integer) invokeN("BindWindowEx", new Object[]{hWnd, display, mouse, keypad, publicDesc, mode}, 6);
    }

    public String GetDiskSerial() throws COMException {
        return (String) invoke("GetDiskSerial");
    }

    public String Md5(String str) throws COMException {
        return (String) invokeN("Md5", new Object[]{str}, 1);
    }

    public String GetMac() throws COMException {
        return (String) invoke("GetMac");
    }

    public int ActiveInputMethod(int hWnd, String id) throws COMException {
        return (Integer) invokeN("ActiveInputMethod", new Object[]{hWnd, id}, 2);
    }

    public int CheckInputMethod(int hWnd, String id) throws COMException {
        return (Integer) invokeN("CheckInputMethod", new Object[]{hWnd, id}, 2);
    }

    public int FindInputMethod(String id) throws COMException {
        return (Integer) invokeN("FindInputMethod", new Object[]{id}, 1);
    }

    public int GetCursorPos(Object x, Object y) throws COMException {
        return (Integer) invokeN("GetCursorPos", new Object[]{x, y}, 2);
    }

    public int BindWindow(int hWnd, String display, String mouse, String keypad, int mode) throws COMException {
        return (Integer) invokeN("BindWindow", new Object[]{hWnd, display, mouse, keypad, mode}, 5);
    }

    public int FindWindow(String className, String titleName) throws COMException {
        return (Integer) invokeN("FindWindow", new Object[]{className, titleName}, 2);
    }

    public int GetScreenDepth() throws COMException {
        return (Integer) invoke("GetScreenDepth");
    }

    public int SetScreen(int width, int height, int depth) throws COMException {
        return (Integer) invokeN("SetScreen", new Object[]{width, height, depth}, 3);
    }

    public int ExitOs(int type) throws COMException {
        return (Integer) invokeN("ExitOs", new Object[]{type}, 1);
    }

    public String GetDir(int type) throws COMException {
        return (String) invokeN("GetDir", new Object[]{type}, 1);
    }

    public int GetOsType() throws COMException {
        return (Integer) invoke("GetOsType");
    }

    public int FindWindowEx(int parent, String className, String titleName) throws COMException {
        return (Integer) invokeN("FindWindowEx", new Object[]{parent, className, titleName}, 3);
    }

    public int SetExportDict(int index, String dictName) throws COMException {
        return (Integer) invokeN("SetExportDict", new Object[]{index, dictName}, 2);
    }

    public String GetCursorShape() throws COMException {
        return (String) invoke("GetCursorShape");
    }

    public int DownCpu(int rate) throws COMException {
        return (Integer) invokeN("DownCpu", new Object[]{rate}, 1);
    }

    public String GetCursorSpot() throws COMException {
        return (String) invoke("GetCursorSpot");
    }

    public int SendString2(int hWnd, String str) throws COMException {
        return (Integer) invokeN("SendString2", new Object[]{hWnd, str}, 2);
    }

    public int FaqPost(String server, int handle, int requestType, int timeOut) throws COMException {
        return (Integer) invokeN("FaqPost", new Object[]{server, handle, requestType, timeOut}, 4);
    }

    public String FaqFetch() throws COMException {
        return (String) invoke("FaqFetch");
    }

    public String FetchWord(int x1, int y1, int x2, int y2, String color, String word) throws COMException {
        return (String) invokeN("FetchWord", new Object[]{x1, y1, x2, y2, color, word}, 6);
    }

    public int CaptureJpg(int x1, int y1, int x2, int y2, String file, int quality) throws COMException {
        return (Integer) invokeN("CaptureJpg", new Object[]{x1, y1, x2, y2, file, quality}, 6);
    }

    public int FindStrWithFont(int x1, int y1, int x2, int y2, String str, String color, double sim, String fontName, int fontSize, int flag, Object x, Object y) throws COMException {
        return (Integer) invokeN("FindStrWithFont", new Object[]{x1, y1, x2, y2, str, color, sim, fontName, fontSize, flag, x, y}, 12);
    }

    public String FindStrWithFontE(int x1, int y1, int x2, int y2, String str, String color, double sim, String fontName, int fontSize, int flag) throws COMException {
        return (String) invokeN("FindStrWithFontE", new Object[]{x1, y1, x2, y2, str, color, sim, fontName, fontSize, flag}, 10);
    }

    public String FindStrWithFontEx(int x1, int y1, int x2, int y2, String str, String color, double sim, String fontName, int fontSize, int flag) throws COMException {
        return (String) invokeN("FindStrWithFontEx", new Object[]{x1, y1, x2, y2, str, color, sim, fontName, fontSize, flag}, 10);
    }

    public String GetDictInfo(String str, String fontName, int fontSize, int flag) throws COMException {
        return (String) invokeN("GetDictInfo", new Object[]{str, fontName, fontSize, flag}, 4);
    }

    public int SaveDict(int index, String file) throws COMException {
        return (Integer) invokeN("SaveDict", new Object[]{index, file}, 2);
    }

    public int GetWindowProcessId(int hWnd) throws COMException {
        return (Integer) invokeN("GetWindowProcessId", new Object[]{hWnd}, 1);
    }

    public String GetWindowProcessPath(int hWnd) throws COMException {
        return (String) invokeN("GetWindowProcessPath", new Object[]{hWnd}, 1);
    }

    public int LockInput(int lock) throws COMException {
        return (Integer) invokeN("LockInput", new Object[]{lock}, 1);
    }

    public String GetPicSize(String picName) throws COMException {
        return (String) invokeN("GetPicSize", new Object[]{picName}, 1);
    }

    public int GetID() throws COMException {
        return (Integer) invoke("GetID");
    }

    public int CapturePng(int x1, int y1, int x2, int y2, String file) throws COMException {
        return (Integer) invokeN("CapturePng", new Object[]{x1, y1, x2, y2, file}, 5);
    }

    public int CaptureGif(int x1, int y1, int x2, int y2, String file, int delay, int time) throws COMException {
        return (Integer) invokeN("CaptureGif", new Object[]{x1, y1, x2, y2, file, delay, time}, 7);
    }

    public int ImageToBmp(String picName, String bmpName) throws COMException {
        return (Integer) invokeN("ImageToBmp", new Object[]{picName, bmpName}, 2);
    }

    public int FindStrFast(int x1, int y1, int x2, int y2, String str, String color, double sim, Object x, Object y) throws COMException {
        return (Integer) invokeN("FindStrFast", new Object[]{x1, y1, x2, y2, str, color, sim, x, y}, 9);
    }

    public String FindStrFastEx(int x1, int y1, int x2, int y2, String str, String color, double sim) throws COMException {
        return (String) invokeN("FindStrFastEx", new Object[]{x1, y1, x2, y2, str, color, sim}, 7);
    }

    public String FindStrFastE(int x1, int y1, int x2, int y2, String str, String color, double sim) throws COMException {
        return (String) invokeN("FindStrFastE", new Object[]{x1, y1, x2, y2, str, color, sim}, 7);
    }

    public int EnableDisplayDebug(int enableDebug) throws COMException {
        return (Integer) invokeN("EnableDisplayDebug", new Object[]{enableDebug}, 1);
    }

    public int CapturePre(String file) throws COMException {
        return (Integer) invokeN("CapturePre", new Object[]{file}, 1);
    }

    public int RegEx(String code, String Ver, String ip) throws COMException {
        return (Integer) invokeN("RegEx", new Object[]{code, Ver, ip}, 3);
    }

    public String GetMachineCode() throws COMException {
        return (String) invoke("GetMachineCode");
    }

    public int SetClipboard(String data) throws COMException {
        return (Integer) invokeN("SetClipboard", new Object[]{data}, 1);
    }

    public String GetClipboard() throws COMException {
        return (String) invoke("GetClipboard");
    }

    public int GetNowDict() throws COMException {
        return (Integer) invoke("GetNowDict");
    }

    public int Is64Bit() throws COMException {
        return (Integer) invoke("Is64Bit");
    }

    public int GetColorNum(int x1, int y1, int x2, int y2, String color, double sim) throws COMException {
        return (Integer) invokeN("GetColorNum", new Object[]{x1, y1, x2, y2, color, sim}, 6);
    }

    public String EnumWindowByProcess(String processName, String title, String className, int filter) throws COMException {
        return (String) invokeN("EnumWindowByProcess", new Object[]{processName, title, className, filter}, 4);
    }

    public int GetDictCount(int index) throws COMException {
        return (Integer) invokeN("GetDictCount", new Object[]{index}, 1);
    }

    public int GetLastError() throws COMException {
        return (Integer) invoke("GetLastError");
    }

    public String GetNetTime() throws COMException {
        return (String) invoke("GetNetTime");
    }

    public int EnableGetColorByCapture(int en) throws COMException {
        return (Integer) invokeN("EnableGetColorByCapture", new Object[]{en}, 1);
    }

    public int CheckUAC() throws COMException {
        return (Integer) invoke("CheckUAC");
    }

    public int SetUAC(int uac) throws COMException {
        return (Integer) invokeN("SetUAC", new Object[]{uac}, 1);
    }

    public int DisableFontSmooth() throws COMException {
        return (Integer) invoke("DisableFontSmooth");
    }

    public int CheckFontSmooth() throws COMException {
        return (Integer) invoke("CheckFontSmooth");
    }

    public int SetDisplayAcceler(int level) throws COMException {
        return (Integer) invokeN("SetDisplayAcceler", new Object[]{level}, 1);
    }

    public int FindWindowByProcess(String processName, String className, String titleName) throws COMException {
        return (Integer) invokeN("FindWindowByProcess", new Object[]{processName, className, titleName}, 3);
    }

    public int FindWindowByProcessId(int processId, String className, String titleName) throws COMException {
        return (Integer) invokeN("FindWindowByProcessId", new Object[]{processId, className, titleName}, 3);
    }

    public String ReadIni(String section, String key, String file) throws COMException {
        return (String) invokeN("ReadIni", new Object[]{section, key, file}, 3);
    }

    public int WriteIni(String section, String key, String v, String file) throws COMException {
        return (Integer) invokeN("WriteIni", new Object[]{section, key, v, file}, 4);
    }

    public int RunApp(String path, int mode) throws COMException {
        return (Integer) invokeN("RunApp", new Object[]{path, mode}, 2);
    }

    public int delay(int mis) throws COMException {
        return (Integer) invokeN("delay", new Object[]{mis}, 1);
    }

    public int FindWindowSuper(String spec1, int flag1, int type1, String spec2, int flag2, int type2) throws COMException {
        return (Integer) invokeN("FindWindowSuper", new Object[]{spec1, flag1, type1, spec2, flag2, type2}, 6);
    }

    public String ExcludePos(String allPos, int type, int x1, int y1, int x2, int y2) throws COMException {
        return (String) invokeN("ExcludePos", new Object[]{allPos, type, x1, y1, x2, y2}, 6);
    }

    public String FindNearestPos(String allPos, int type, int x, int y) throws COMException {
        return (String) invokeN("FindNearestPos", new Object[]{allPos, type, x, y}, 4);
    }

    public String SortPosDistance(String allPos, int type, int x, int y) throws COMException {
        return (String) invokeN("SortPosDistance", new Object[]{allPos, type, x, y}, 4);
    }

    public int FindPicMem(int x1, int y1, int x2, int y2, String picInfo, String deltaColor, double sim, int dir, Object x, Object y) throws COMException {
        return (Integer) invokeN("FindPicMem", new Object[]{x1, y1, x2, y2, picInfo, deltaColor, sim, dir, x, y}, 10);
    }

    public String FindPicMemEx(int x1, int y1, int x2, int y2, String picInfo, String deltaColor, double sim, int dir) throws COMException {
        return (String) invokeN("FindPicMemEx", new Object[]{x1, y1, x2, y2, picInfo, deltaColor, sim, dir}, 8);
    }

    public String FindPicMemE(int x1, int y1, int x2, int y2, String picInfo, String deltaColor, double sim, int dir) throws COMException {
        return (String) invokeN("FindPicMemE", new Object[]{x1, y1, x2, y2, picInfo, deltaColor, sim, dir}, 8);
    }

    public String AppendPicAddr(String picInfo, int addr, int size) throws COMException {
        return (String) invokeN("AppendPicAddr", new Object[]{picInfo, addr, size}, 3);
    }

    public int WriteFile(String file, String content) throws COMException {
        return (Integer) invokeN("WriteFile", new Object[]{file, content}, 2);
    }

    public int Stop(int id) throws COMException {
        return (Integer) invokeN("Stop", new Object[]{id}, 1);
    }

    public int SetDictMem(int index, int addr, int size) throws COMException {
        return (Integer) invokeN("SetDictMem", new Object[]{index, addr, size}, 3);
    }

    public String GetNetTimeSafe() throws COMException {
        return (String) invoke("GetNetTimeSafe");
    }

    public int ForceUnBindWindow(int hWnd) throws COMException {
        return (Integer) invokeN("ForceUnBindWindow", new Object[]{hWnd}, 1);
    }

    public String ReadIniPwd(String section, String key, String file, String pwd) throws COMException {
        return (String) invokeN("ReadIniPwd", new Object[]{section, key, file, pwd}, 4);
    }

    public int WriteIniPwd(String section, String key, String v, String file, String pwd) throws COMException {
        return (Integer) invokeN("WriteIniPwd", new Object[]{section, key, v, file, pwd}, 5);
    }

    public int DecodeFile(String file, String pwd) throws COMException {
        return (Integer) invokeN("DecodeFile", new Object[]{file, pwd}, 2);
    }

    public int KeyDownChar(String keyStr) throws COMException {
        return (Integer) invokeN("KeyDownChar", new Object[]{keyStr}, 1);
    }

    public int KeyUpChar(String keyStr) throws COMException {
        return (Integer) invokeN("KeyUpChar", new Object[]{keyStr}, 1);
    }

    public int KeyPressChar(String keyStr) throws COMException {
        return (Integer) invokeN("KeyPressChar", new Object[]{keyStr}, 1);
    }

    public int KeyPressStr(String keyStr, int delay) throws COMException {
        return (Integer) invokeN("KeyPressStr", new Object[]{keyStr, delay}, 2);
    }

    public int EnableKeypadPatch(int en) throws COMException {
        return (Integer) invokeN("EnableKeypadPatch", new Object[]{en}, 1);
    }

    public int EnableKeypadSync(int en, int timeOut) throws COMException {
        return (Integer) invokeN("EnableKeypadSync", new Object[]{en, timeOut}, 2);
    }

    public int EnableMouseSync(int en, int timeOut) throws COMException {
        return (Integer) invokeN("EnableMouseSync", new Object[]{en, timeOut}, 2);
    }

    public int DmGuard(int en, String type) throws COMException {
        return (Integer) invokeN("DmGuard", new Object[]{en, type}, 2);
    }

    public int FaqCaptureFromFile(int x1, int y1, int x2, int y2, String file, int quality) throws COMException {
        return (Integer) invokeN("FaqCaptureFromFile", new Object[]{x1, y1, x2, y2, file, quality}, 6);
    }

    public String FindIntEx(int hWnd, String addrRange, int intValueMin, int intValueMax, int type, int step, int multiThread, int mode) throws COMException {
        return (String) invokeN("FindIntEx", new Object[]{hWnd, addrRange, intValueMin, intValueMax, type, step, multiThread, mode}, 8);
    }

    public String FindFloatEx(int hWnd, String addrRange, float floatValueMin, float floatValueMax, int step, int multiThread, int mode) throws COMException {
        return (String) invokeN("FindFloatEx", new Object[]{hWnd, addrRange, floatValueMin, floatValueMax, step, multiThread, mode}, 7);
    }

    public String FindDoubleEx(int hWnd, String addrRange, double doubleValueMin, double doubleValueMax, int step, int multiThread, int mode) throws COMException {
        return (String) invokeN("FindDoubleEx", new Object[]{hWnd, addrRange, doubleValueMin, doubleValueMax, step, multiThread, mode}, 7);
    }

    public String FindStringEx(int hWnd, String addrRange, String stringValue, int type, int step, int multiThread, int mode) throws COMException {
        return (String) invokeN("FindStringEx", new Object[]{hWnd, addrRange, stringValue, type, step, multiThread, mode}, 7);
    }

    public String FindDataEx(int hWnd, String addrRange, String data, int step, int multiThread, int mode) throws COMException {
        return (String) invokeN("FindDataEx", new Object[]{hWnd, addrRange, data, step, multiThread, mode}, 6);
    }

    public int EnableRealMouse(int en, int mouseDelay, int mouseStep) throws COMException {
        return (Integer) invokeN("EnableRealMouse", new Object[]{en, mouseDelay, mouseStep}, 3);
    }

    public int EnableRealKeypad(int en) throws COMException {
        return (Integer) invokeN("EnableRealKeypad", new Object[]{en}, 1);
    }

    public int SendStringIme(String str) throws COMException {
        return (Integer) invokeN("SendStringIme", new Object[]{str}, 1);
    }

    public int FoobarDrawLine(int hWnd, int x1, int y1, int x2, int y2, String color, int style, int width) throws COMException {
        return (Integer) invokeN("FoobarDrawLine", new Object[]{hWnd, x1, y1, x2, y2, color, style, width}, 8);
    }

    public String FindStrEx(int x1, int y1, int x2, int y2, String str, String color, double sim) throws COMException {
        return (String) invokeN("FindStrEx", new Object[]{x1, y1, x2, y2, str, color, sim}, 7);
    }

    public int IsBind(int hWnd) throws COMException {
        return (Integer) invokeN("IsBind", new Object[]{hWnd}, 1);
    }

    public int SetDisplayDelay(int t) throws COMException {
        return (Integer) invokeN("SetDisplayDelay", new Object[]{t}, 1);
    }

    public int GetDmCount() throws COMException {
        return (Integer) invoke("GetDmCount");
    }

    public int DisableScreenSave() throws COMException {
        return (Integer) invoke("DisableScreenSave");
    }

    public int DisablePowerSave() throws COMException {
        return (Integer) invoke("DisablePowerSave");
    }

    public int SetMemoryHwndAsProcessId(int en) throws COMException {
        return (Integer) invokeN("SetMemoryHwndAsProcessId", new Object[]{en}, 1);
    }

    public int FindShape(int x1, int y1, int x2, int y2, String offsetColor, double sim, int dir, Object x, Object y) throws COMException {
        return (Integer) invokeN("FindShape", new Object[]{x1, y1, x2, y2, offsetColor, sim, dir, x, y}, 9);
    }

    public String FindShapeE(int x1, int y1, int x2, int y2, String offsetColor, double sim, int dir) throws COMException {
        return (String) invokeN("FindShapeE", new Object[]{x1, y1, x2, y2, offsetColor, sim, dir}, 7);
    }

    public String FindShapeEx(int x1, int y1, int x2, int y2, String offsetColor, double sim, int dir) throws COMException {
        return (String) invokeN("FindShapeEx", new Object[]{x1, y1, x2, y2, offsetColor, sim, dir}, 7);
    }

    public String FindStrS(int x1, int y1, int x2, int y2, String str, String color, double sim, Object x, Object y) throws COMException {
        return (String) invokeN("FindStrS", new Object[]{x1, y1, x2, y2, str, color, sim, x, y}, 9);
    }

    public String FindStrExS(int x1, int y1, int x2, int y2, String str, String color, double sim) throws COMException {
        return (String) invokeN("FindStrExS", new Object[]{x1, y1, x2, y2, str, color, sim}, 7);
    }

    public String FindStrFastS(int x1, int y1, int x2, int y2, String str, String color, double sim, Object x, Object y) throws COMException {
        return (String) invokeN("FindStrFastS", new Object[]{x1, y1, x2, y2, str, color, sim, x, y}, 9);
    }

    public String FindStrFastExS(int x1, int y1, int x2, int y2, String str, String color, double sim) throws COMException {
        return (String) invokeN("FindStrFastExS", new Object[]{x1, y1, x2, y2, str, color, sim}, 7);
    }

    public String FindPicS(int x1, int y1, int x2, int y2, String picName, String deltaColor, double sim, int dir, Object x, Object y) throws COMException {
        return (String) invokeN("FindPicS", new Object[]{x1, y1, x2, y2, picName, deltaColor, sim, dir, x, y}, 10);
    }

    public String FindPicExS(int x1, int y1, int x2, int y2, String picName, String deltaColor, double sim, int dir) throws COMException {
        return (String) invokeN("FindPicExS", new Object[]{x1, y1, x2, y2, picName, deltaColor, sim, dir}, 8);
    }

    public int ClearDict(int index) throws COMException {
        return (Integer) invokeN("ClearDict", new Object[]{index}, 1);
    }

    public String GetMachineCodeNoMac() throws COMException {
        return (String) invoke("GetMachineCodeNoMac");
    }

    public int GetClientRect(int hWnd, Object x1, Object y1, Object x2, Object y2) throws COMException {
        return (Integer) invokeN("GetClientRect", new Object[]{hWnd, x1, y1, x2, y2}, 5);
    }

    public int EnableFakeActive(int en) throws COMException {
        return (Integer) invokeN("EnableFakeActive", new Object[]{en}, 1);
    }

    public int GetScreenDataBmp(int x1, int y1, int x2, int y2, Object data, Object size) throws COMException {
        return (Integer) invokeN("GetScreenDataBmp", new Object[]{x1, y1, x2, y2, data, size}, 6);
    }

    public int EncodeFile(String file, String pwd) throws COMException {
        return (Integer) invokeN("EncodeFile", new Object[]{file, pwd}, 2);
    }

    public String GetCursorShapeEx(int type) throws COMException {
        return (String) invokeN("GetCursorShapeEx", new Object[]{type}, 1);
    }

    public int FaqCancel() throws COMException {
        return (Integer) invoke("FaqCancel");
    }

    public String IntToData(int intValue, int type) throws COMException {
        return (String) invokeN("IntToData", new Object[]{intValue, type}, 2);
    }

    public String FloatToData(float floatValue) throws COMException {
        return (String) invokeN("FloatToData", new Object[]{floatValue}, 1);
    }

    public String DoubleToData(double doubleValue) throws COMException {
        return (String) invokeN("DoubleToData", new Object[]{doubleValue}, 1);
    }

    public String StringToData(String stringValue, int type) throws COMException {
        return (String) invokeN("StringToData", new Object[]{stringValue, type}, 2);
    }

    public int SetMemoryFindResultToFile(String file) throws COMException {
        return (Integer) invokeN("SetMemoryFindResultToFile", new Object[]{file}, 1);
    }

    public int EnableBind(int en) throws COMException {
        return (Integer) invokeN("EnableBind", new Object[]{en}, 1);
    }

    public int SetSimMode(int mode) throws COMException {
        return (Integer) invokeN("SetSimMode", new Object[]{mode}, 1);
    }

    public int LockMouseRect(int x1, int y1, int x2, int y2) throws COMException {
        return (Integer) invokeN("LockMouseRect", new Object[]{x1, y1, x2, y2}, 4);
    }

    public int SendPaste(int hWnd) throws COMException {
        return (Integer) invokeN("SendPaste", new Object[]{hWnd}, 1);
    }

    public int IsDisplayDead(int x1, int y1, int x2, int y2, int t) throws COMException {
        return (Integer) invokeN("IsDisplayDead", new Object[]{x1, y1, x2, y2, t}, 5);
    }

    public int GetKeyState(int vk) throws COMException {
        return (Integer) invokeN("GetKeyState", new Object[]{vk}, 1);
    }

    public int CopyFile(String srcFile, String dstFile, int over) throws COMException {
        return (Integer) invokeN("CopyFile", new Object[]{srcFile, dstFile, over}, 3);
    }

    public int IsFileExist(String file) throws COMException {
        return (Integer) invokeN("IsFileExist", new Object[]{file}, 1);
    }

    public int DeleteFile(String file) throws COMException {
        return (Integer) invokeN("DeleteFile", new Object[]{file}, 1);
    }

    public int MoveFile(String srcFile, String dstFile) throws COMException {
        return (Integer) invokeN("MoveFile", new Object[]{srcFile, dstFile}, 2);
    }

    public int CreateFolder(String folderName) throws COMException {
        return (Integer) invokeN("CreateFolder", new Object[]{folderName}, 1);
    }

    public int DeleteFolder(String folderName) throws COMException {
        return (Integer) invokeN("DeleteFolder", new Object[]{folderName}, 1);
    }

    public int GetFileLength(String file) throws COMException {
        return (Integer) invokeN("GetFileLength", new Object[]{file}, 1);
    }

    public String ReadFile(String file) throws COMException {
        return (String) invokeN("ReadFile", new Object[]{file}, 1);
    }

    public int WaitKey(int keyCode, int timeOut) throws COMException {
        return (Integer) invokeN("WaitKey", new Object[]{keyCode, timeOut}, 2);
    }

    public int DeleteIni(String section, String key, String file) throws COMException {
        return (Integer) invokeN("DeleteIni", new Object[]{section, key, file}, 3);
    }

    public int DeleteIniPwd(String section, String key, String file, String pwd) throws COMException {
        return (Integer) invokeN("DeleteIniPwd", new Object[]{section, key, file, pwd}, 4);
    }

    public int EnableSpeedDx(int en) throws COMException {
        return (Integer) invokeN("EnableSpeedDx", new Object[]{en}, 1);
    }

    public int EnableIme(int en) throws COMException {
        return (Integer) invokeN("EnableIme", new Object[]{en}, 1);
    }

    public int Reg(String code, String Ver) throws COMException {
        return (Integer) invokeN("Reg", new Object[]{code, Ver}, 2);
    }

    public String SelectFile() throws COMException {
        return (String) invoke("SelectFile");
    }

    public String SelectDirectory() throws COMException {
        return (String) invoke("SelectDirectory");
    }

    public int LockDisplay(int lock) throws COMException {
        return (Integer) invokeN("LockDisplay", new Object[]{lock}, 1);
    }

    public int FoobarSetSave(int hWnd, String file, int en, String header) throws COMException {
        return (Integer) invokeN("FoobarSetSave", new Object[]{hWnd, file, en, header}, 4);
    }

    public String EnumWindowSuper(String spec1, int flag1, int type1, String spec2, int flag2, int type2, int sort) throws COMException {
        return (String) invokeN("EnumWindowSuper", new Object[]{spec1, flag1, type1, spec2, flag2, type2, sort}, 7);
    }

    public int DownloadFile(String url, String saveFile, int timeout) throws COMException {
        return (Integer) invokeN("DownloadFile", new Object[]{url, saveFile, timeout}, 3);
    }

    public int EnableKeypadMsg(int en) throws COMException {
        return (Integer) invokeN("EnableKeypadMsg", new Object[]{en}, 1);
    }

    public int EnableMouseMsg(int en) throws COMException {
        return (Integer) invokeN("EnableMouseMsg", new Object[]{en}, 1);
    }

    public int RegNoMac(String code, String Ver) throws COMException {
        return (Integer) invokeN("RegNoMac", new Object[]{code, Ver}, 2);
    }

    public int RegExNoMac(String code, String Ver, String ip) throws COMException {
        return (Integer) invokeN("RegExNoMac", new Object[]{code, Ver, ip}, 3);
    }

    public int SetEnumWindowDelay(int delay) throws COMException {
        return (Integer) invokeN("SetEnumWindowDelay", new Object[]{delay}, 1);
    }

    public int FindMulColor(int x1, int y1, int x2, int y2, String color, double sim) throws COMException {
        return (Integer) invokeN("FindMulColor", new Object[]{x1, y1, x2, y2, color, sim}, 6);
    }

    public String GetDict(int index, int fontIndex) throws COMException {
        return (String) invokeN("GetDict", new Object[]{index, fontIndex}, 2);
    }
}
