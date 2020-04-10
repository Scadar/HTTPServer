package ru.scadarnull.http.io;

import javax.sql.DataSource;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Collections;
import java.util.Properties;

public interface HttpServerContext {

    ServerInfo getServerInfo();

    Collection<String> getSupportedRequestMethods();

    Properties getSupportedResponsesStatuses();

    DataSource getDataSource();

    Path getRootPath();

    
}
