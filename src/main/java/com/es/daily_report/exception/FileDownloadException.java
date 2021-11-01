package com.es.daily_report.exception;

/**
 * 文件下载异常
 *
 * @author MrBird
 */
public class FileDownloadException extends DrException {
    private static final long serialVersionUID = -4353976687870027960L;

    public FileDownloadException(String message) {
        super(message);
    }
}
