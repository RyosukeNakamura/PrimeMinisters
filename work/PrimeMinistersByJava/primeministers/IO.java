package primeministers;

/**
 * 入出力：リーダ・ダウンローダ・ライタを抽象する。
 */
public abstract class IO extends Object
{
    
    /**
     *test
     *
     */
    
	/**
	 * ここを作成してください。
	 * まず、次のページを参照しながら、スケルトン（スタブ）を作ることから始めましょう。
	 * http://www.cc.kyoto-su.ac.jp/~atsushi/Programs/CSV2HTML/PrimeMinistersJavaDoc/index.html
	 */
    
    
    /**
     *テーブル（表：スプレッドシート）を記憶するフィールド.
     */
    protected Table table;
    
    
    /**
     *入出力のコンストラクタ
     */
    IO(){
        return;
    }
    
    
    
    /**
     *
     */
    static void deleteFileOrDirectory(java.io.File aFile)
    {
        return;
    }
    
    
    staic java.lang.String encodeingSymbol()
    {
        return "hoge";
    }
    
    /**
     *
     */
    Table tabele()
    {
        tabele = new Table();
        return tabele;
    }
    
}
