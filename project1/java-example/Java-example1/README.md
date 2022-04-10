# Compiler Design Project1
408410056 資工三 許庭涵

## Describe
自訂義需要的token(myLexer.g)，輸入C程式碼經過antlr編譯執行後輸出程式碼內有使用的tokens

使用antlr產生token編號檔案(myLexer.tokens)及token的擷取方法的檔案(myLexer.java)

再使用antlr編譯java檔案(myLexer.java、testLexer.java)產生class檔

最後輸入範例程式檔(*.c)，用antlr執行textLexer產生範例程式檔內所有有用到的tokens

## Install ANTLR
安裝ANTLR3.5.2 :http://www.antlr3.org/download/antlr-3.5.2-complete-no-st3.jar

將antlr-3.5.2-complete-no-st3.exe置於<span style="color:brown">**測試檔案的前一個資料夾**</span>

另外此程式需於linux環境下執行，可安裝Ubuntu Terminal執行

## Compile & Execute
在Terminal 輸入 `make` 即可完成編譯執行並輸出三個測試程式碼(sample1.c、sample2.c、sample3.c)的token結果(output1.txt、output2.txt、output3.txt)

另外輸入`make clean`可將執行時產生的.class、.tokens清除