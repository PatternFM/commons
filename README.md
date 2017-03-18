[![Build Status](https://travis-ci.org/PatternFM/commons.svg?branch=master)](https://travis-ci.org/PatternFM/commons)
[![Coverage Status](https://coveralls.io/repos/github/PatternFM/commons/badge.svg?branch=master)](https://coveralls.io/github/PatternFM/commons?branch=master)  

## Introduction

Pattern Commons is a minimal library for common functions including identity generation, JSON parsing and reflection.

To get started, add the following dependency to your depedency list:
```xml
<dependency>
    <groupId>fm.pattern</groupId>
    <artifactId>commons-util</artifactId>
    <version>1.0.7</version>
</dependency>
```

## Identity Generation

By default, the id generator will produce a 25 character length alphanumeric string, with a mix of uppercase and lowercase characters:
```
  IdGenerator.generateId() => 'jDWatQsPtRNOMhYAnVWUDF3LE'
```

You can specify the length of the id to generate by provding a length argument:
```
  IdGenerator.generateId(5) => 'pciIi'
  IdGenerator.generateId(50) => 'Sf3hcRp8yIveqZbkx3AMTpomZzbDVHfxyOIyGzjZCaPaGdc0NC'
```

You can add a prefix to generated ids. The id generator will add an underscore between the prefix and the alphanumeric sequence.
```
  IdGenerator.generateId("txn") => 'txn_jDWatQsPtRNOMhYAnVWUDF3LE'
```


## Building from Source

Both JDK 8 and Maven 3 are required to build Pattern Commons from source. With these prerequisites in place you can build Pattern Commons by:
```
git clone https://github.com/PatternFM/commons.git
cd commons
mvn clean install
```

## Continuous Integration

The Continuous Integration service for the project is hosted on [Travis](https://travis-ci.org/PatternFM/commons) 


## Licensing

This software is provided and distributed under the Apache Software License 2.0. Refer to LICENSE.txt for more information.