# quarkus-mcp-server-demos

### Problem
Input schema generated for method:
`hello(Person person)`

```
"inputSchema": {
          "type": "object",
          "properties": {
            "person": {
              "type": "object",
              "properties": {
                "name": {
                  "type": "string",
                  "description": "Bar",
                  "minLength": 1
                }
              },
              "required": [
                "name"
              ],
              "description": "Foo"
            }
          },
          "required": [
            "person"
          ]
        }
```

Input schema generated with @Valid:
`hello(@Valid Person person)`

```
"inputSchema": {
          "type": "object",
          "properties": null,
          "required": [
            "person"
          ]
        }
```

### Usage
Use Intellij HttpClient.    
Run all the requests in `test/http/mcp.http` to setup the McpSessionId.  
To view the input schema, run the request `Tools List`
