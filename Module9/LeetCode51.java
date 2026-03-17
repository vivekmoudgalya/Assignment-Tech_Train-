package LeetCode;

import java.util.*;
class LeetCode51
{
	public List<List<String>> solveNQueens(int n)
	{
		List<List<String>> r=new ArrayList<>();
		char[][] b=new char[n][n];
		for(char[] row:b)Arrays.fill(row,'.');
	solve(0,b,r);
	return r;
	}
	void solve(int c,char[][] b,List<List<String>> r)
	{
		if(c==b.length)
		{
			List<String> t=new ArrayList<>();
			for(char[] row:b)t.add(new String(row));
			r.add(t);
			return;
		}
		for(int i=0;i<b.length;i++)
		{
			if(valid(b,i,c))
			{
				b[i][c]='Q';
				solve(c+1,b,r);
				b[i][c]='.';
			}
		}
	}	
	boolean valid(char[][] b,int r,int c)
	{
		for(int i=0;i<c;i++)if(b[r][i]=='Q')return false;
		for(int i=r,j=c;i>=0&&j>=0;i--,j--)if(b[i][j]=='Q')return false;
		for(int i=r,j=c;i<b.length&&j>=0;i++,j--)if(b[i][j]=='Q')return false;
		return true;
	}
	public static void main(String[] args)
	{
		LeetCode51 s=new LeetCode51();
		System.out.println(s.solveNQueens(4));
	}
}