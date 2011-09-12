val filesHere = new java.io.File("/root").listFiles
def queryMatching(query: String, matcher: (String) => Boolean)
{
	for(file <- filesHere; if matcher(file.getName, query))
		println(file.getName)
}
def queryEndWith(query: String) = queryMatching(query, _.endsWith(_))
def queryContain(query: String) = queryMatching(query, _.contains(_))
def queryRegex(query: String) = queryMatching(query, _.matches(_))
queryEndWith("log")
println("-----------------")
queryContain("BACK")
println("-----------------")
queryRegex(".*client.*")

