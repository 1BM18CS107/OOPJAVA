class generics <T>
{
    T ob;
    
    generics(T obj)
    {
        ob = obj;
    }
    
    T ret()
    {
    	return ob;
    }
    
    void showtype()
    {
    	System.out.println(ob.getClass().getName());
    }
    
}

class genmain
{
	public static void main(String arg[])
	{
		generics <Integer> g = new generics <Integer>(50);
		int x = g.ret();
		System.out.println(x);
		g.showtype();
		generics<String> s = new generics <String>("Good morning all of you");
		String y = s.ret();
		System.out.println(y);
		s.showtype();
	}
}
