# JUnit-Testing-Android

final SettableFuture<String> future = SettableFuture.create();
String result = future.get(4, TimeUnit.SECONDS);
assertEquals(result,"aa");
